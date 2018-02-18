package com.educate.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("Tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("Tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("Tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("Tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("Tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("Tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("Tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("Tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("Tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("Tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("Tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("Tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("Tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("Tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("Tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("Tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("Tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("Tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("Tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("Tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("Tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("Tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("Tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("Tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("Tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("Tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("Tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("Tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTsexIsNull() {
            addCriterion("Tsex is null");
            return (Criteria) this;
        }

        public Criteria andTsexIsNotNull() {
            addCriterion("Tsex is not null");
            return (Criteria) this;
        }

        public Criteria andTsexEqualTo(String value) {
            addCriterion("Tsex =", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotEqualTo(String value) {
            addCriterion("Tsex <>", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThan(String value) {
            addCriterion("Tsex >", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThanOrEqualTo(String value) {
            addCriterion("Tsex >=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThan(String value) {
            addCriterion("Tsex <", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThanOrEqualTo(String value) {
            addCriterion("Tsex <=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLike(String value) {
            addCriterion("Tsex like", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotLike(String value) {
            addCriterion("Tsex not like", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexIn(List<String> values) {
            addCriterion("Tsex in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotIn(List<String> values) {
            addCriterion("Tsex not in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexBetween(String value1, String value2) {
            addCriterion("Tsex between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotBetween(String value1, String value2) {
            addCriterion("Tsex not between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTphoneIsNull() {
            addCriterion("Tphone is null");
            return (Criteria) this;
        }

        public Criteria andTphoneIsNotNull() {
            addCriterion("Tphone is not null");
            return (Criteria) this;
        }

        public Criteria andTphoneEqualTo(String value) {
            addCriterion("Tphone =", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotEqualTo(String value) {
            addCriterion("Tphone <>", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneGreaterThan(String value) {
            addCriterion("Tphone >", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneGreaterThanOrEqualTo(String value) {
            addCriterion("Tphone >=", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLessThan(String value) {
            addCriterion("Tphone <", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLessThanOrEqualTo(String value) {
            addCriterion("Tphone <=", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneLike(String value) {
            addCriterion("Tphone like", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotLike(String value) {
            addCriterion("Tphone not like", value, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneIn(List<String> values) {
            addCriterion("Tphone in", values, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotIn(List<String> values) {
            addCriterion("Tphone not in", values, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneBetween(String value1, String value2) {
            addCriterion("Tphone between", value1, value2, "tphone");
            return (Criteria) this;
        }

        public Criteria andTphoneNotBetween(String value1, String value2) {
            addCriterion("Tphone not between", value1, value2, "tphone");
            return (Criteria) this;
        }

        public Criteria andTnamedIsNull() {
            addCriterion("Tnamed is null");
            return (Criteria) this;
        }

        public Criteria andTnamedIsNotNull() {
            addCriterion("Tnamed is not null");
            return (Criteria) this;
        }

        public Criteria andTnamedEqualTo(String value) {
            addCriterion("Tnamed =", value, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedNotEqualTo(String value) {
            addCriterion("Tnamed <>", value, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedGreaterThan(String value) {
            addCriterion("Tnamed >", value, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedGreaterThanOrEqualTo(String value) {
            addCriterion("Tnamed >=", value, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedLessThan(String value) {
            addCriterion("Tnamed <", value, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedLessThanOrEqualTo(String value) {
            addCriterion("Tnamed <=", value, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedLike(String value) {
            addCriterion("Tnamed like", value, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedNotLike(String value) {
            addCriterion("Tnamed not like", value, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedIn(List<String> values) {
            addCriterion("Tnamed in", values, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedNotIn(List<String> values) {
            addCriterion("Tnamed not in", values, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedBetween(String value1, String value2) {
            addCriterion("Tnamed between", value1, value2, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTnamedNotBetween(String value1, String value2) {
            addCriterion("Tnamed not between", value1, value2, "tnamed");
            return (Criteria) this;
        }

        public Criteria andTclassIsNull() {
            addCriterion("Tclass is null");
            return (Criteria) this;
        }

        public Criteria andTclassIsNotNull() {
            addCriterion("Tclass is not null");
            return (Criteria) this;
        }

        public Criteria andTclassEqualTo(String value) {
            addCriterion("Tclass =", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassNotEqualTo(String value) {
            addCriterion("Tclass <>", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassGreaterThan(String value) {
            addCriterion("Tclass >", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassGreaterThanOrEqualTo(String value) {
            addCriterion("Tclass >=", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassLessThan(String value) {
            addCriterion("Tclass <", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassLessThanOrEqualTo(String value) {
            addCriterion("Tclass <=", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassLike(String value) {
            addCriterion("Tclass like", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassNotLike(String value) {
            addCriterion("Tclass not like", value, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassIn(List<String> values) {
            addCriterion("Tclass in", values, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassNotIn(List<String> values) {
            addCriterion("Tclass not in", values, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassBetween(String value1, String value2) {
            addCriterion("Tclass between", value1, value2, "tclass");
            return (Criteria) this;
        }

        public Criteria andTclassNotBetween(String value1, String value2) {
            addCriterion("Tclass not between", value1, value2, "tclass");
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