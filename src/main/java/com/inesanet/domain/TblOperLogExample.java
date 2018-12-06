package com.inesanet.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblOperLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblOperLogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andExeResultIsNull() {
            addCriterion("EXE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andExeResultIsNotNull() {
            addCriterion("EXE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andExeResultEqualTo(String value) {
            addCriterion("EXE_RESULT =", value, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultNotEqualTo(String value) {
            addCriterion("EXE_RESULT <>", value, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultGreaterThan(String value) {
            addCriterion("EXE_RESULT >", value, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultGreaterThanOrEqualTo(String value) {
            addCriterion("EXE_RESULT >=", value, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultLessThan(String value) {
            addCriterion("EXE_RESULT <", value, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultLessThanOrEqualTo(String value) {
            addCriterion("EXE_RESULT <=", value, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultLike(String value) {
            addCriterion("EXE_RESULT like", value, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultNotLike(String value) {
            addCriterion("EXE_RESULT not like", value, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultIn(List<String> values) {
            addCriterion("EXE_RESULT in", values, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultNotIn(List<String> values) {
            addCriterion("EXE_RESULT not in", values, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultBetween(String value1, String value2) {
            addCriterion("EXE_RESULT between", value1, value2, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeResultNotBetween(String value1, String value2) {
            addCriterion("EXE_RESULT not between", value1, value2, "exeResult");
            return (Criteria) this;
        }

        public Criteria andExeTimeIsNull() {
            addCriterion("EXE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExeTimeIsNotNull() {
            addCriterion("EXE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExeTimeEqualTo(Date value) {
            addCriterion("EXE_TIME =", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeNotEqualTo(Date value) {
            addCriterion("EXE_TIME <>", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeGreaterThan(Date value) {
            addCriterion("EXE_TIME >", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXE_TIME >=", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeLessThan(Date value) {
            addCriterion("EXE_TIME <", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXE_TIME <=", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeIn(List<Date> values) {
            addCriterion("EXE_TIME in", values, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeNotIn(List<Date> values) {
            addCriterion("EXE_TIME not in", values, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeBetween(Date value1, Date value2) {
            addCriterion("EXE_TIME between", value1, value2, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXE_TIME not between", value1, value2, "exeTime");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNull() {
            addCriterion("FUNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("FUNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(Integer value) {
            addCriterion("FUNC_ID =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(Integer value) {
            addCriterion("FUNC_ID <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(Integer value) {
            addCriterion("FUNC_ID >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUNC_ID >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(Integer value) {
            addCriterion("FUNC_ID <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(Integer value) {
            addCriterion("FUNC_ID <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<Integer> values) {
            addCriterion("FUNC_ID in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<Integer> values) {
            addCriterion("FUNC_ID not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_ID between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_ID not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Long value) {
            addCriterion("OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Long value) {
            addCriterion("OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Long value) {
            addCriterion("OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Long value) {
            addCriterion("OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Long> values) {
            addCriterion("OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Long> values) {
            addCriterion("OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeIsNull() {
            addCriterion("REC_CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeIsNotNull() {
            addCriterion("REC_CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeEqualTo(Date value) {
            addCriterion("REC_CRT_TIME =", value, "recCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeNotEqualTo(Date value) {
            addCriterion("REC_CRT_TIME <>", value, "recCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeGreaterThan(Date value) {
            addCriterion("REC_CRT_TIME >", value, "recCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_CRT_TIME >=", value, "recCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeLessThan(Date value) {
            addCriterion("REC_CRT_TIME <", value, "recCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("REC_CRT_TIME <=", value, "recCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeIn(List<Date> values) {
            addCriterion("REC_CRT_TIME in", values, "recCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeNotIn(List<Date> values) {
            addCriterion("REC_CRT_TIME not in", values, "recCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeBetween(Date value1, Date value2) {
            addCriterion("REC_CRT_TIME between", value1, value2, "recCrtTime");
            return (Criteria) this;
        }

        public Criteria andRecCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("REC_CRT_TIME not between", value1, value2, "recCrtTime");
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