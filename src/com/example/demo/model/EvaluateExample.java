package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEvaluateIdIsNull() {
            addCriterion("evaluate_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIsNotNull() {
            addCriterion("evaluate_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdEqualTo(Integer value) {
            addCriterion("evaluate_id =", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotEqualTo(Integer value) {
            addCriterion("evaluate_id <>", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThan(Integer value) {
            addCriterion("evaluate_id >", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_id >=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThan(Integer value) {
            addCriterion("evaluate_id <", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_id <=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIn(List<Integer> values) {
            addCriterion("evaluate_id in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotIn(List<Integer> values) {
            addCriterion("evaluate_id not in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_id between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_id not between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
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

        public Criteria andDetailsIdIsNull() {
            addCriterion("details_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIdIsNotNull() {
            addCriterion("details_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsIdEqualTo(Integer value) {
            addCriterion("details_id =", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotEqualTo(Integer value) {
            addCriterion("details_id <>", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdGreaterThan(Integer value) {
            addCriterion("details_id >", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("details_id >=", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdLessThan(Integer value) {
            addCriterion("details_id <", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("details_id <=", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdIn(List<Integer> values) {
            addCriterion("details_id in", values, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotIn(List<Integer> values) {
            addCriterion("details_id not in", values, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("details_id between", value1, value2, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("details_id not between", value1, value2, "detailsId");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeIsNull() {
            addCriterion("evaluate_theme is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeIsNotNull() {
            addCriterion("evaluate_theme is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeEqualTo(String value) {
            addCriterion("evaluate_theme =", value, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeNotEqualTo(String value) {
            addCriterion("evaluate_theme <>", value, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeGreaterThan(String value) {
            addCriterion("evaluate_theme >", value, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_theme >=", value, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeLessThan(String value) {
            addCriterion("evaluate_theme <", value, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeLessThanOrEqualTo(String value) {
            addCriterion("evaluate_theme <=", value, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeLike(String value) {
            addCriterion("evaluate_theme like", value, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeNotLike(String value) {
            addCriterion("evaluate_theme not like", value, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeIn(List<String> values) {
            addCriterion("evaluate_theme in", values, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeNotIn(List<String> values) {
            addCriterion("evaluate_theme not in", values, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeBetween(String value1, String value2) {
            addCriterion("evaluate_theme between", value1, value2, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateThemeNotBetween(String value1, String value2) {
            addCriterion("evaluate_theme not between", value1, value2, "evaluateTheme");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNull() {
            addCriterion("evaluate_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNotNull() {
            addCriterion("evaluate_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentEqualTo(String value) {
            addCriterion("evaluate_content =", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotEqualTo(String value) {
            addCriterion("evaluate_content <>", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThan(String value) {
            addCriterion("evaluate_content >", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_content >=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThan(String value) {
            addCriterion("evaluate_content <", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThanOrEqualTo(String value) {
            addCriterion("evaluate_content <=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLike(String value) {
            addCriterion("evaluate_content like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotLike(String value) {
            addCriterion("evaluate_content not like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIn(List<String> values) {
            addCriterion("evaluate_content in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotIn(List<String> values) {
            addCriterion("evaluate_content not in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentBetween(String value1, String value2) {
            addCriterion("evaluate_content between", value1, value2, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotBetween(String value1, String value2) {
            addCriterion("evaluate_content not between", value1, value2, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberIsNull() {
            addCriterion("evaluete_number is null");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberIsNotNull() {
            addCriterion("evaluete_number is not null");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberEqualTo(Integer value) {
            addCriterion("evaluete_number =", value, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberNotEqualTo(Integer value) {
            addCriterion("evaluete_number <>", value, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberGreaterThan(Integer value) {
            addCriterion("evaluete_number >", value, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluete_number >=", value, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberLessThan(Integer value) {
            addCriterion("evaluete_number <", value, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberLessThanOrEqualTo(Integer value) {
            addCriterion("evaluete_number <=", value, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberIn(List<Integer> values) {
            addCriterion("evaluete_number in", values, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberNotIn(List<Integer> values) {
            addCriterion("evaluete_number not in", values, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberBetween(Integer value1, Integer value2) {
            addCriterion("evaluete_number between", value1, value2, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluete_number not between", value1, value2, "evalueteNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberIsNull() {
            addCriterion("evaluete_help_number is null");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberIsNotNull() {
            addCriterion("evaluete_help_number is not null");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberEqualTo(Integer value) {
            addCriterion("evaluete_help_number =", value, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberNotEqualTo(Integer value) {
            addCriterion("evaluete_help_number <>", value, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberGreaterThan(Integer value) {
            addCriterion("evaluete_help_number >", value, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluete_help_number >=", value, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberLessThan(Integer value) {
            addCriterion("evaluete_help_number <", value, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberLessThanOrEqualTo(Integer value) {
            addCriterion("evaluete_help_number <=", value, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberIn(List<Integer> values) {
            addCriterion("evaluete_help_number in", values, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberNotIn(List<Integer> values) {
            addCriterion("evaluete_help_number not in", values, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberBetween(Integer value1, Integer value2) {
            addCriterion("evaluete_help_number between", value1, value2, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteHelpNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluete_help_number not between", value1, value2, "evalueteHelpNumber");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeIsNull() {
            addCriterion("evaluete_time is null");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeIsNotNull() {
            addCriterion("evaluete_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeEqualTo(Date value) {
            addCriterion("evaluete_time =", value, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeNotEqualTo(Date value) {
            addCriterion("evaluete_time <>", value, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeGreaterThan(Date value) {
            addCriterion("evaluete_time >", value, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluete_time >=", value, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeLessThan(Date value) {
            addCriterion("evaluete_time <", value, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluete_time <=", value, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeIn(List<Date> values) {
            addCriterion("evaluete_time in", values, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeNotIn(List<Date> values) {
            addCriterion("evaluete_time not in", values, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeBetween(Date value1, Date value2) {
            addCriterion("evaluete_time between", value1, value2, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andEvalueteTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluete_time not between", value1, value2, "evalueteTime");
            return (Criteria) this;
        }

        public Criteria andRamerkIsNull() {
            addCriterion("ramerk is null");
            return (Criteria) this;
        }

        public Criteria andRamerkIsNotNull() {
            addCriterion("ramerk is not null");
            return (Criteria) this;
        }

        public Criteria andRamerkEqualTo(String value) {
            addCriterion("ramerk =", value, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkNotEqualTo(String value) {
            addCriterion("ramerk <>", value, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkGreaterThan(String value) {
            addCriterion("ramerk >", value, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkGreaterThanOrEqualTo(String value) {
            addCriterion("ramerk >=", value, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkLessThan(String value) {
            addCriterion("ramerk <", value, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkLessThanOrEqualTo(String value) {
            addCriterion("ramerk <=", value, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkLike(String value) {
            addCriterion("ramerk like", value, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkNotLike(String value) {
            addCriterion("ramerk not like", value, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkIn(List<String> values) {
            addCriterion("ramerk in", values, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkNotIn(List<String> values) {
            addCriterion("ramerk not in", values, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkBetween(String value1, String value2) {
            addCriterion("ramerk between", value1, value2, "ramerk");
            return (Criteria) this;
        }

        public Criteria andRamerkNotBetween(String value1, String value2) {
            addCriterion("ramerk not between", value1, value2, "ramerk");
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