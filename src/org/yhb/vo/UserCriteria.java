package org.yhb.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int start = -1;

    protected int end = -1;

    public UserCriteria() {
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

    public void setStart(int start) {
        this.start=start;
    }

    public int getStart() {
        return start;
    }

    public void setEnd(int end) {
        this.end=end;
    }

    public int getEnd() {
        return end;
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Byte value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Byte value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Byte value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Byte value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Byte value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Byte value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Byte> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Byte> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Byte value1, Byte value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Byte value1, Byte value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regTime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Date value) {
            addCriterion("regTime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Date value) {
            addCriterion("regTime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Date value) {
            addCriterion("regTime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("regTime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Date value) {
            addCriterion("regTime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("regTime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Date> values) {
            addCriterion("regTime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Date> values) {
            addCriterion("regTime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Date value1, Date value2) {
            addCriterion("regTime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("regTime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegipIsNull() {
            addCriterion("regIp is null");
            return (Criteria) this;
        }

        public Criteria andRegipIsNotNull() {
            addCriterion("regIp is not null");
            return (Criteria) this;
        }

        public Criteria andRegipEqualTo(String value) {
            addCriterion("regIp =", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotEqualTo(String value) {
            addCriterion("regIp <>", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipGreaterThan(String value) {
            addCriterion("regIp >", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipGreaterThanOrEqualTo(String value) {
            addCriterion("regIp >=", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLessThan(String value) {
            addCriterion("regIp <", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLessThanOrEqualTo(String value) {
            addCriterion("regIp <=", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLike(String value) {
            addCriterion("regIp like", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotLike(String value) {
            addCriterion("regIp not like", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipIn(List<String> values) {
            addCriterion("regIp in", values, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotIn(List<String> values) {
            addCriterion("regIp not in", values, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipBetween(String value1, String value2) {
            addCriterion("regIp between", value1, value2, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotBetween(String value1, String value2) {
            addCriterion("regIp not between", value1, value2, "regip");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("lastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("lastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("lastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("lastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("lastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("lastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("lastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("lastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNull() {
            addCriterion("lastLoginIp is null");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNotNull() {
            addCriterion("lastLoginIp is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginipEqualTo(String value) {
            addCriterion("lastLoginIp =", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotEqualTo(String value) {
            addCriterion("lastLoginIp <>", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThan(String value) {
            addCriterion("lastLoginIp >", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThanOrEqualTo(String value) {
            addCriterion("lastLoginIp >=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThan(String value) {
            addCriterion("lastLoginIp <", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThanOrEqualTo(String value) {
            addCriterion("lastLoginIp <=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLike(String value) {
            addCriterion("lastLoginIp like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotLike(String value) {
            addCriterion("lastLoginIp not like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipIn(List<String> values) {
            addCriterion("lastLoginIp in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotIn(List<String> values) {
            addCriterion("lastLoginIp not in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipBetween(String value1, String value2) {
            addCriterion("lastLoginIp between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotBetween(String value1, String value2) {
            addCriterion("lastLoginIp not between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andTeapositionIsNull() {
            addCriterion("teaPosition is null");
            return (Criteria) this;
        }

        public Criteria andTeapositionIsNotNull() {
            addCriterion("teaPosition is not null");
            return (Criteria) this;
        }

        public Criteria andTeapositionEqualTo(Byte value) {
            addCriterion("teaPosition =", value, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeapositionNotEqualTo(Byte value) {
            addCriterion("teaPosition <>", value, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeapositionGreaterThan(Byte value) {
            addCriterion("teaPosition >", value, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeapositionGreaterThanOrEqualTo(Byte value) {
            addCriterion("teaPosition >=", value, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeapositionLessThan(Byte value) {
            addCriterion("teaPosition <", value, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeapositionLessThanOrEqualTo(Byte value) {
            addCriterion("teaPosition <=", value, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeapositionIn(List<Byte> values) {
            addCriterion("teaPosition in", values, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeapositionNotIn(List<Byte> values) {
            addCriterion("teaPosition not in", values, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeapositionBetween(Byte value1, Byte value2) {
            addCriterion("teaPosition between", value1, value2, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeapositionNotBetween(Byte value1, Byte value2) {
            addCriterion("teaPosition not between", value1, value2, "teaposition");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuIsNull() {
            addCriterion("teaCurrentStu is null");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuIsNotNull() {
            addCriterion("teaCurrentStu is not null");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuEqualTo(Byte value) {
            addCriterion("teaCurrentStu =", value, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuNotEqualTo(Byte value) {
            addCriterion("teaCurrentStu <>", value, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuGreaterThan(Byte value) {
            addCriterion("teaCurrentStu >", value, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuGreaterThanOrEqualTo(Byte value) {
            addCriterion("teaCurrentStu >=", value, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuLessThan(Byte value) {
            addCriterion("teaCurrentStu <", value, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuLessThanOrEqualTo(Byte value) {
            addCriterion("teaCurrentStu <=", value, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuIn(List<Byte> values) {
            addCriterion("teaCurrentStu in", values, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuNotIn(List<Byte> values) {
            addCriterion("teaCurrentStu not in", values, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuBetween(Byte value1, Byte value2) {
            addCriterion("teaCurrentStu between", value1, value2, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeacurrentstuNotBetween(Byte value1, Byte value2) {
            addCriterion("teaCurrentStu not between", value1, value2, "teacurrentstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuIsNull() {
            addCriterion("teaMaxStu is null");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuIsNotNull() {
            addCriterion("teaMaxStu is not null");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuEqualTo(Byte value) {
            addCriterion("teaMaxStu =", value, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuNotEqualTo(Byte value) {
            addCriterion("teaMaxStu <>", value, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuGreaterThan(Byte value) {
            addCriterion("teaMaxStu >", value, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuGreaterThanOrEqualTo(Byte value) {
            addCriterion("teaMaxStu >=", value, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuLessThan(Byte value) {
            addCriterion("teaMaxStu <", value, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuLessThanOrEqualTo(Byte value) {
            addCriterion("teaMaxStu <=", value, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuIn(List<Byte> values) {
            addCriterion("teaMaxStu in", values, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuNotIn(List<Byte> values) {
            addCriterion("teaMaxStu not in", values, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuBetween(Byte value1, Byte value2) {
            addCriterion("teaMaxStu between", value1, value2, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andTeamaxstuNotBetween(Byte value1, Byte value2) {
            addCriterion("teaMaxStu not between", value1, value2, "teamaxstu");
            return (Criteria) this;
        }

        public Criteria andStunumberIsNull() {
            addCriterion("stuNumber is null");
            return (Criteria) this;
        }

        public Criteria andStunumberIsNotNull() {
            addCriterion("stuNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStunumberEqualTo(String value) {
            addCriterion("stuNumber =", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberNotEqualTo(String value) {
            addCriterion("stuNumber <>", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberGreaterThan(String value) {
            addCriterion("stuNumber >", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberGreaterThanOrEqualTo(String value) {
            addCriterion("stuNumber >=", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberLessThan(String value) {
            addCriterion("stuNumber <", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberLessThanOrEqualTo(String value) {
            addCriterion("stuNumber <=", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberLike(String value) {
            addCriterion("stuNumber like", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberNotLike(String value) {
            addCriterion("stuNumber not like", value, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberIn(List<String> values) {
            addCriterion("stuNumber in", values, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberNotIn(List<String> values) {
            addCriterion("stuNumber not in", values, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberBetween(String value1, String value2) {
            addCriterion("stuNumber between", value1, value2, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStunumberNotBetween(String value1, String value2) {
            addCriterion("stuNumber not between", value1, value2, "stunumber");
            return (Criteria) this;
        }

        public Criteria andStuclassidIsNull() {
            addCriterion("stuClassId is null");
            return (Criteria) this;
        }

        public Criteria andStuclassidIsNotNull() {
            addCriterion("stuClassId is not null");
            return (Criteria) this;
        }

        public Criteria andStuclassidEqualTo(Byte value) {
            addCriterion("stuClassId =", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidNotEqualTo(Byte value) {
            addCriterion("stuClassId <>", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidGreaterThan(Byte value) {
            addCriterion("stuClassId >", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidGreaterThanOrEqualTo(Byte value) {
            addCriterion("stuClassId >=", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidLessThan(Byte value) {
            addCriterion("stuClassId <", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidLessThanOrEqualTo(Byte value) {
            addCriterion("stuClassId <=", value, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidIn(List<Byte> values) {
            addCriterion("stuClassId in", values, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidNotIn(List<Byte> values) {
            addCriterion("stuClassId not in", values, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidBetween(Byte value1, Byte value2) {
            addCriterion("stuClassId between", value1, value2, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStuclassidNotBetween(Byte value1, Byte value2) {
            addCriterion("stuClassId not between", value1, value2, "stuclassid");
            return (Criteria) this;
        }

        public Criteria andStucourseidIsNull() {
            addCriterion("stuCourseId is null");
            return (Criteria) this;
        }

        public Criteria andStucourseidIsNotNull() {
            addCriterion("stuCourseId is not null");
            return (Criteria) this;
        }

        public Criteria andStucourseidEqualTo(Integer value) {
            addCriterion("stuCourseId =", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidNotEqualTo(Integer value) {
            addCriterion("stuCourseId <>", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidGreaterThan(Integer value) {
            addCriterion("stuCourseId >", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuCourseId >=", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidLessThan(Integer value) {
            addCriterion("stuCourseId <", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidLessThanOrEqualTo(Integer value) {
            addCriterion("stuCourseId <=", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidIn(List<Integer> values) {
            addCriterion("stuCourseId in", values, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidNotIn(List<Integer> values) {
            addCriterion("stuCourseId not in", values, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidBetween(Integer value1, Integer value2) {
            addCriterion("stuCourseId between", value1, value2, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("stuCourseId not between", value1, value2, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridIsNull() {
            addCriterion("stuTeacherId is null");
            return (Criteria) this;
        }

        public Criteria andStuteacheridIsNotNull() {
            addCriterion("stuTeacherId is not null");
            return (Criteria) this;
        }

        public Criteria andStuteacheridEqualTo(Integer value) {
            addCriterion("stuTeacherId =", value, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridNotEqualTo(Integer value) {
            addCriterion("stuTeacherId <>", value, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridGreaterThan(Integer value) {
            addCriterion("stuTeacherId >", value, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuTeacherId >=", value, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridLessThan(Integer value) {
            addCriterion("stuTeacherId <", value, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridLessThanOrEqualTo(Integer value) {
            addCriterion("stuTeacherId <=", value, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridIn(List<Integer> values) {
            addCriterion("stuTeacherId in", values, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridNotIn(List<Integer> values) {
            addCriterion("stuTeacherId not in", values, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridBetween(Integer value1, Integer value2) {
            addCriterion("stuTeacherId between", value1, value2, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andStuteacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("stuTeacherId not between", value1, value2, "stuteacherid");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("isDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("isDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Byte value) {
            addCriterion("isDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Byte value) {
            addCriterion("isDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Byte value) {
            addCriterion("isDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Byte value) {
            addCriterion("isDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Byte value) {
            addCriterion("isDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Byte> values) {
            addCriterion("isDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Byte> values) {
            addCriterion("isDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Byte value1, Byte value2) {
            addCriterion("isDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("isDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(userName) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andRegipLikeInsensitive(String value) {
            addCriterion("upper(regIp) like", value.toUpperCase(), "regip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLikeInsensitive(String value) {
            addCriterion("upper(lastLoginIp) like", value.toUpperCase(), "lastloginip");
            return (Criteria) this;
        }

        public Criteria andStunumberLikeInsensitive(String value) {
            addCriterion("upper(stuNumber) like", value.toUpperCase(), "stunumber");
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