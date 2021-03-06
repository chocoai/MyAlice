package com.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.myalice.MyAliceSpringConfig;
import com.myalice.domain.ElasticsearchData;
import com.myalice.services.ESQuestionService;
import com.myalice.utils.Tools;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = MyAliceSpringConfig.class)
public class ESTest2 {

	@Autowired
	ESQuestionService questionService;

	@Test
	public void test01() {
		Map<String, Object> data = new HashMap<>();
		data.put("title", "如何开始学习Mycat");
		data.put("state", 1);
		questionService.add(data);
		questionService.remove("1");
	}

	@Test
	public void test03() {
		try {

			Files.readAllLines(Paths.get("1.txt")).forEach(line -> {
				System.out.println(line);
				Map<String, Object> data = new HashMap<>();
				data.put("title", line);
				data.put("state", 1);
				data.put("create_user", "admin");
				data.put("create_date", Tools.currentDate());
				questionService.add(data);
			});
		} catch (IOException e) {

		}
	}

	@Test
	public void test02() {
		ElasticsearchData searchData = new ElasticsearchData();
		searchData.setPageId(2);
		searchData.setSize(10);

		QueryBuilder builder = QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("title", "刹车片马瑞利"))
				.must(QueryBuilders.matchQuery("state", 1));

		searchData.setBuilder(builder);

		questionService.query(searchData);

		searchData.getDocs().forEach(action -> System.out.println(action));
	}

	@Test
	public void test04() {
		List<Map<String, Object>> answers = questionService.queryAnswer(QueryBuilders.boolQuery()
				.must(QueryBuilders.matchQuery("question_id", "29ee44f5be3e47fea706db07571def1e")));
		
		System.out.println(answers);
	}
}
