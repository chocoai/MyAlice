package com.myalice.domain;

import java.util.Date;

public class TalkRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column talk_record.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column talk_record.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column talk_record.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column talk_record.user_type
     *
     * @mbg.generated
     */
    private String userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column talk_record.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column talk_record.connection_id
     *
     * @mbg.generated
     */
    private String connectionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column talk_record.reply
     *
     * @mbg.generated
     */
    private String reply;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column talk_record.id
     *
     * @return the value of talk_record.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column talk_record.id
     *
     * @param id the value for talk_record.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column talk_record.content
     *
     * @return the value of talk_record.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column talk_record.content
     *
     * @param content the value for talk_record.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column talk_record.user_id
     *
     * @return the value of talk_record.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column talk_record.user_id
     *
     * @param userId the value for talk_record.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column talk_record.user_type
     *
     * @return the value of talk_record.user_type
     *
     * @mbg.generated
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column talk_record.user_type
     *
     * @param userType the value for talk_record.user_type
     *
     * @mbg.generated
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column talk_record.create_time
     *
     * @return the value of talk_record.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column talk_record.create_time
     *
     * @param createTime the value for talk_record.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column talk_record.connection_id
     *
     * @return the value of talk_record.connection_id
     *
     * @mbg.generated
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column talk_record.connection_id
     *
     * @param connectionId the value for talk_record.connection_id
     *
     * @mbg.generated
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column talk_record.reply
     *
     * @return the value of talk_record.reply
     *
     * @mbg.generated
     */
    public String getReply() {
        return reply;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column talk_record.reply
     *
     * @param reply the value for talk_record.reply
     *
     * @mbg.generated
     */
    public void setReply(String reply) {
        this.reply = reply;
    }
}