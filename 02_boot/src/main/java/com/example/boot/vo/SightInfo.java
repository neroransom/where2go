package com.example.boot.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;


/**
 * @Author : wangziyu
 * @Date : 2020/6/6 19:12
 * 作为景点详细信息的返回对象
 */
public class SightInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.sight_id
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    @JSONField(name = "sight_id")
    private Integer sightId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.sight_name
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    @JSONField(name = "sight_name")
    private String sightName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.sight_type
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    @JSONField(name = "sight_type")
    private String sightType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.state
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.country
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.city
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.score
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private BigDecimal score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.views
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private Integer views;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.happiness_index
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    @JSONField(name = "happiness_index")
    private BigDecimal happinessIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.angry
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private BigDecimal angry;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.depress
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private BigDecimal depress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.fear
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private BigDecimal fear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.happy
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private BigDecimal happy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.sad
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private BigDecimal sad;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.surprise
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private BigDecimal surprise;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.neutral
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private BigDecimal neutral;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sight.description
     *
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    private String description;

    @JSONField(name = "happiness_index_rank")
    private Integer happinessIndexRank;

    @JSONField(name = "popularity_rank")
    private Integer popularityRank;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.sight_id
     *
     * @return the value of sight.sight_id
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public Integer getSightId() {
        return sightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.sight_id
     *
     * @param sightId the value for sight.sight_id
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setSightId(Integer sightId) {
        this.sightId = sightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.sight_name
     *
     * @return the value of sight.sight_name
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public String getSightName() {
        return sightName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.sight_name
     *
     * @param sightName the value for sight.sight_name
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setSightName(String sightName) {
        this.sightName = sightName == null ? null : sightName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.sight_type
     *
     * @return the value of sight.sight_type
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public String getSightType() {
        return sightType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.sight_type
     *
     * @param sightType the value for sight.sight_type
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setSightType(String sightType) {
        this.sightType = sightType == null ? null : sightType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.state
     *
     * @return the value of sight.state
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.state
     *
     * @param state the value for sight.state
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.country
     *
     * @return the value of sight.country
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.country
     *
     * @param country the value for sight.country
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.city
     *
     * @return the value of sight.city
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.city
     *
     * @param city the value for sight.city
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.score
     *
     * @return the value of sight.score
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.score
     *
     * @param score the value for sight.score
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.views
     *
     * @return the value of sight.views
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public Integer getViews() {
        return views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.views
     *
     * @param views the value for sight.views
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.happiness_index
     *
     * @return the value of sight.happiness_index
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public BigDecimal getHappinessIndex() {
        return happinessIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.happiness_index
     *
     * @param happinessIndex the value for sight.happiness_index
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setHappinessIndex(BigDecimal happinessIndex) {
        this.happinessIndex = happinessIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.angry
     *
     * @return the value of sight.angry
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public BigDecimal getAngry() {
        return angry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.angry
     *
     * @param angry the value for sight.angry
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setAngry(BigDecimal angry) {
        this.angry = angry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.depress
     *
     * @return the value of sight.depress
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public BigDecimal getDepress() {
        return depress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.depress
     *
     * @param depress the value for sight.depress
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setDepress(BigDecimal depress) {
        this.depress = depress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.fear
     *
     * @return the value of sight.fear
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public BigDecimal getFear() {
        return fear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.fear
     *
     * @param fear the value for sight.fear
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setFear(BigDecimal fear) {
        this.fear = fear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.happy
     *
     * @return the value of sight.happy
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public BigDecimal getHappy() {
        return happy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.happy
     *
     * @param happy the value for sight.happy
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setHappy(BigDecimal happy) {
        this.happy = happy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.sad
     *
     * @return the value of sight.sad
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public BigDecimal getSad() {
        return sad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.sad
     *
     * @param sad the value for sight.sad
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setSad(BigDecimal sad) {
        this.sad = sad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.surprise
     *
     * @return the value of sight.surprise
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public BigDecimal getSurprise() {
        return surprise;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.surprise
     *
     * @param surprise the value for sight.surprise
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setSurprise(BigDecimal surprise) {
        this.surprise = surprise;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.neutral
     *
     * @return the value of sight.neutral
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public BigDecimal getNeutral() {
        return neutral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.neutral
     *
     * @param neutral the value for sight.neutral
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setNeutral(BigDecimal neutral) {
        this.neutral = neutral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sight.description
     *
     * @return the value of sight.description
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sight.description
     *
     * @param description the value for sight.description
     * @mbg.generated Fri Jun 05 23:22:52 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getHappinessIndexRank() {
        return happinessIndexRank;
    }

    public void setHappinessIndexRank(Integer happinessIndexRank) {
        this.happinessIndexRank = happinessIndexRank;
    }

    public Integer getPopularityRank() {
        return popularityRank;
    }

    public void setPopularityRank(Integer popularityRank) {
        this.popularityRank = popularityRank;
    }
}
