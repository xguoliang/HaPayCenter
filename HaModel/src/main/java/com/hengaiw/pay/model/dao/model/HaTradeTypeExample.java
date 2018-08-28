package com.hengaiw.pay.model.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HaTradeTypeExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public HaTradeTypeExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andTrade_type_idIsNull() {
            addCriterion("trade_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idIsNotNull() {
            addCriterion("trade_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idEqualTo(Integer value) {
            addCriterion("trade_type_id =", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idNotEqualTo(Integer value) {
            addCriterion("trade_type_id <>", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idGreaterThan(Integer value) {
            addCriterion("trade_type_id >", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_type_id >=", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idLessThan(Integer value) {
            addCriterion("trade_type_id <", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("trade_type_id <=", value, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idIn(List<Integer> values) {
            addCriterion("trade_type_id in", values, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idNotIn(List<Integer> values) {
            addCriterion("trade_type_id not in", values, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idBetween(Integer value1, Integer value2) {
            addCriterion("trade_type_id between", value1, value2, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_type_id not between", value1, value2, "trade_type_id");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameIsNull() {
            addCriterion("trade_type_name is null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameIsNotNull() {
            addCriterion("trade_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameEqualTo(String value) {
            addCriterion("trade_type_name =", value, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameNotEqualTo(String value) {
            addCriterion("trade_type_name <>", value, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameGreaterThan(String value) {
            addCriterion("trade_type_name >", value, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type_name >=", value, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameLessThan(String value) {
            addCriterion("trade_type_name <", value, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameLessThanOrEqualTo(String value) {
            addCriterion("trade_type_name <=", value, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameLike(String value) {
            addCriterion("trade_type_name like", value, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameNotLike(String value) {
            addCriterion("trade_type_name not like", value, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameIn(List<String> values) {
            addCriterion("trade_type_name in", values, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameNotIn(List<String> values) {
            addCriterion("trade_type_name not in", values, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameBetween(String value1, String value2) {
            addCriterion("trade_type_name between", value1, value2, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nameNotBetween(String value1, String value2) {
            addCriterion("trade_type_name not between", value1, value2, "trade_type_name");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameIsNull() {
            addCriterion("trade_type_nickname is null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameIsNotNull() {
            addCriterion("trade_type_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameEqualTo(String value) {
            addCriterion("trade_type_nickname =", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameNotEqualTo(String value) {
            addCriterion("trade_type_nickname <>", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameGreaterThan(String value) {
            addCriterion("trade_type_nickname >", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type_nickname >=", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameLessThan(String value) {
            addCriterion("trade_type_nickname <", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameLessThanOrEqualTo(String value) {
            addCriterion("trade_type_nickname <=", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameLike(String value) {
            addCriterion("trade_type_nickname like", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameNotLike(String value) {
            addCriterion("trade_type_nickname not like", value, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameIn(List<String> values) {
            addCriterion("trade_type_nickname in", values, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameNotIn(List<String> values) {
            addCriterion("trade_type_nickname not in", values, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameBetween(String value1, String value2) {
            addCriterion("trade_type_nickname between", value1, value2, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andTrade_type_nicknameNotBetween(String value1, String value2) {
            addCriterion("trade_type_nickname not between", value1, value2, "trade_type_nickname");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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