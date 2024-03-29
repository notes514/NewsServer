package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class NewsDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsDetailsExample() {
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

        public Criteria andDetailsContentIsNull() {
            addCriterion("details_content is null");
            return (Criteria) this;
        }

        public Criteria andDetailsContentIsNotNull() {
            addCriterion("details_content is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsContentEqualTo(String value) {
            addCriterion("details_content =", value, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentNotEqualTo(String value) {
            addCriterion("details_content <>", value, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentGreaterThan(String value) {
            addCriterion("details_content >", value, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentGreaterThanOrEqualTo(String value) {
            addCriterion("details_content >=", value, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentLessThan(String value) {
            addCriterion("details_content <", value, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentLessThanOrEqualTo(String value) {
            addCriterion("details_content <=", value, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentLike(String value) {
            addCriterion("details_content like", value, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentNotLike(String value) {
            addCriterion("details_content not like", value, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentIn(List<String> values) {
            addCriterion("details_content in", values, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentNotIn(List<String> values) {
            addCriterion("details_content not in", values, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentBetween(String value1, String value2) {
            addCriterion("details_content between", value1, value2, "detailsContent");
            return (Criteria) this;
        }

        public Criteria andDetailsContentNotBetween(String value1, String value2) {
            addCriterion("details_content not between", value1, value2, "detailsContent");
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