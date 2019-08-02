package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsContentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andNewsThemeIsNull() {
            addCriterion("news_theme is null");
            return (Criteria) this;
        }

        public Criteria andNewsThemeIsNotNull() {
            addCriterion("news_theme is not null");
            return (Criteria) this;
        }

        public Criteria andNewsThemeEqualTo(String value) {
            addCriterion("news_theme =", value, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeNotEqualTo(String value) {
            addCriterion("news_theme <>", value, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeGreaterThan(String value) {
            addCriterion("news_theme >", value, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeGreaterThanOrEqualTo(String value) {
            addCriterion("news_theme >=", value, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeLessThan(String value) {
            addCriterion("news_theme <", value, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeLessThanOrEqualTo(String value) {
            addCriterion("news_theme <=", value, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeLike(String value) {
            addCriterion("news_theme like", value, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeNotLike(String value) {
            addCriterion("news_theme not like", value, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeIn(List<String> values) {
            addCriterion("news_theme in", values, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeNotIn(List<String> values) {
            addCriterion("news_theme not in", values, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeBetween(String value1, String value2) {
            addCriterion("news_theme between", value1, value2, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsThemeNotBetween(String value1, String value2) {
            addCriterion("news_theme not between", value1, value2, "newsTheme");
            return (Criteria) this;
        }

        public Criteria andNewsPicIsNull() {
            addCriterion("news_pic is null");
            return (Criteria) this;
        }

        public Criteria andNewsPicIsNotNull() {
            addCriterion("news_pic is not null");
            return (Criteria) this;
        }

        public Criteria andNewsPicEqualTo(String value) {
            addCriterion("news_pic =", value, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicNotEqualTo(String value) {
            addCriterion("news_pic <>", value, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicGreaterThan(String value) {
            addCriterion("news_pic >", value, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicGreaterThanOrEqualTo(String value) {
            addCriterion("news_pic >=", value, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicLessThan(String value) {
            addCriterion("news_pic <", value, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicLessThanOrEqualTo(String value) {
            addCriterion("news_pic <=", value, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicLike(String value) {
            addCriterion("news_pic like", value, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicNotLike(String value) {
            addCriterion("news_pic not like", value, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicIn(List<String> values) {
            addCriterion("news_pic in", values, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicNotIn(List<String> values) {
            addCriterion("news_pic not in", values, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicBetween(String value1, String value2) {
            addCriterion("news_pic between", value1, value2, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPicNotBetween(String value1, String value2) {
            addCriterion("news_pic not between", value1, value2, "newsPic");
            return (Criteria) this;
        }

        public Criteria andNewsPressIsNull() {
            addCriterion("news_press is null");
            return (Criteria) this;
        }

        public Criteria andNewsPressIsNotNull() {
            addCriterion("news_press is not null");
            return (Criteria) this;
        }

        public Criteria andNewsPressEqualTo(String value) {
            addCriterion("news_press =", value, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressNotEqualTo(String value) {
            addCriterion("news_press <>", value, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressGreaterThan(String value) {
            addCriterion("news_press >", value, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressGreaterThanOrEqualTo(String value) {
            addCriterion("news_press >=", value, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressLessThan(String value) {
            addCriterion("news_press <", value, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressLessThanOrEqualTo(String value) {
            addCriterion("news_press <=", value, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressLike(String value) {
            addCriterion("news_press like", value, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressNotLike(String value) {
            addCriterion("news_press not like", value, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressIn(List<String> values) {
            addCriterion("news_press in", values, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressNotIn(List<String> values) {
            addCriterion("news_press not in", values, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressBetween(String value1, String value2) {
            addCriterion("news_press between", value1, value2, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsPressNotBetween(String value1, String value2) {
            addCriterion("news_press not between", value1, value2, "newsPress");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNull() {
            addCriterion("news_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNotNull() {
            addCriterion("news_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeEqualTo(Date value) {
            addCriterion("news_time =", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotEqualTo(Date value) {
            addCriterion("news_time <>", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThan(Date value) {
            addCriterion("news_time >", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("news_time >=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThan(Date value) {
            addCriterion("news_time <", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThanOrEqualTo(Date value) {
            addCriterion("news_time <=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIn(List<Date> values) {
            addCriterion("news_time in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotIn(List<Date> values) {
            addCriterion("news_time not in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeBetween(Date value1, Date value2) {
            addCriterion("news_time between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotBetween(Date value1, Date value2) {
            addCriterion("news_time not between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}