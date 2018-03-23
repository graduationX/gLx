package com.educate.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("Sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("Sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("Sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("Sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("Sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("Sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("Sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("Sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("Sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("Sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("Sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("Sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("Sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("Sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("Sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("Sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("Sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("Sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("Sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("Sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("Sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("Sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("Sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("Sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("Sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("Sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("Sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("Sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("Ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("Ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("Ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("Ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("Ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("Ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("Ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("Ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("Ssex like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("Ssex not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("Ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("Ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("Ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("Ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSclassIsNull() {
            addCriterion("Sclass is null");
            return (Criteria) this;
        }

        public Criteria andSclassIsNotNull() {
            addCriterion("Sclass is not null");
            return (Criteria) this;
        }

        public Criteria andSclassEqualTo(String value) {
            addCriterion("Sclass =", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotEqualTo(String value) {
            addCriterion("Sclass <>", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThan(String value) {
            addCriterion("Sclass >", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThanOrEqualTo(String value) {
            addCriterion("Sclass >=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThan(String value) {
            addCriterion("Sclass <", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThanOrEqualTo(String value) {
            addCriterion("Sclass <=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLike(String value) {
            addCriterion("Sclass like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotLike(String value) {
            addCriterion("Sclass not like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassIn(List<String> values) {
            addCriterion("Sclass in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotIn(List<String> values) {
            addCriterion("Sclass not in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassBetween(String value1, String value2) {
            addCriterion("Sclass between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotBetween(String value1, String value2) {
            addCriterion("Sclass not between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("Birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("Birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("Birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("Birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("Birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("Birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("Birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("Birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("Birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("Birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("Birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("Birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("Saddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("Saddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("Saddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("Saddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("Saddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("Saddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("Saddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("Saddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("Saddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("Saddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("Saddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("Saddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("Saddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("Saddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andStimeIsNull() {
            addCriterion("Stime is null");
            return (Criteria) this;
        }

        public Criteria andStimeIsNotNull() {
            addCriterion("Stime is not null");
            return (Criteria) this;
        }

        public Criteria andStimeEqualTo(Date value) {
            addCriterion("Stime =", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotEqualTo(Date value) {
            addCriterion("Stime <>", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThan(Date value) {
            addCriterion("Stime >", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Stime >=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThan(Date value) {
            addCriterion("Stime <", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeLessThanOrEqualTo(Date value) {
            addCriterion("Stime <=", value, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeIn(List<Date> values) {
            addCriterion("Stime in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotIn(List<Date> values) {
            addCriterion("Stime not in", values, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeBetween(Date value1, Date value2) {
            addCriterion("Stime between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andStimeNotBetween(Date value1, Date value2) {
            addCriterion("Stime not between", value1, value2, "stime");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNull() {
            addCriterion("Sphone is null");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNotNull() {
            addCriterion("Sphone is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneEqualTo(String value) {
            addCriterion("Sphone =", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotEqualTo(String value) {
            addCriterion("Sphone <>", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThan(String value) {
            addCriterion("Sphone >", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThanOrEqualTo(String value) {
            addCriterion("Sphone >=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThan(String value) {
            addCriterion("Sphone <", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThanOrEqualTo(String value) {
            addCriterion("Sphone <=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLike(String value) {
            addCriterion("Sphone like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotLike(String value) {
            addCriterion("Sphone not like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneIn(List<String> values) {
            addCriterion("Sphone in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotIn(List<String> values) {
            addCriterion("Sphone not in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneBetween(String value1, String value2) {
            addCriterion("Sphone between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotBetween(String value1, String value2) {
            addCriterion("Sphone not between", value1, value2, "sphone");
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