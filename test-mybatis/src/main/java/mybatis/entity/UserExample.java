package mybatis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andPurviewIsNull() {
            addCriterion("purview is null");
            return (Criteria) this;
        }

        public Criteria andPurviewIsNotNull() {
            addCriterion("purview is not null");
            return (Criteria) this;
        }

        public Criteria andPurviewEqualTo(String value) {
            addCriterion("purview =", value, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewNotEqualTo(String value) {
            addCriterion("purview <>", value, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewGreaterThan(String value) {
            addCriterion("purview >", value, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewGreaterThanOrEqualTo(String value) {
            addCriterion("purview >=", value, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewLessThan(String value) {
            addCriterion("purview <", value, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewLessThanOrEqualTo(String value) {
            addCriterion("purview <=", value, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewLike(String value) {
            addCriterion("purview like", value, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewNotLike(String value) {
            addCriterion("purview not like", value, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewIn(List<String> values) {
            addCriterion("purview in", values, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewNotIn(List<String> values) {
            addCriterion("purview not in", values, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewBetween(String value1, String value2) {
            addCriterion("purview between", value1, value2, "purview");
            return (Criteria) this;
        }

        public Criteria andPurviewNotBetween(String value1, String value2) {
            addCriterion("purview not between", value1, value2, "purview");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andPaypasswordIsNull() {
            addCriterion("paypassword is null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIsNotNull() {
            addCriterion("paypassword is not null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordEqualTo(String value) {
            addCriterion("paypassword =", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotEqualTo(String value) {
            addCriterion("paypassword <>", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordGreaterThan(String value) {
            addCriterion("paypassword >", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("paypassword >=", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLessThan(String value) {
            addCriterion("paypassword <", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLessThanOrEqualTo(String value) {
            addCriterion("paypassword <=", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLike(String value) {
            addCriterion("paypassword like", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotLike(String value) {
            addCriterion("paypassword not like", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIn(List<String> values) {
            addCriterion("paypassword in", values, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotIn(List<String> values) {
            addCriterion("paypassword not in", values, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordBetween(String value1, String value2) {
            addCriterion("paypassword between", value1, value2, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotBetween(String value1, String value2) {
            addCriterion("paypassword not between", value1, value2, "paypassword");
            return (Criteria) this;
        }

        public Criteria andIslockIsNull() {
            addCriterion("islock is null");
            return (Criteria) this;
        }

        public Criteria andIslockIsNotNull() {
            addCriterion("islock is not null");
            return (Criteria) this;
        }

        public Criteria andIslockEqualTo(Integer value) {
            addCriterion("islock =", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotEqualTo(Integer value) {
            addCriterion("islock <>", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThan(Integer value) {
            addCriterion("islock >", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThanOrEqualTo(Integer value) {
            addCriterion("islock >=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThan(Integer value) {
            addCriterion("islock <", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThanOrEqualTo(Integer value) {
            addCriterion("islock <=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockIn(List<Integer> values) {
            addCriterion("islock in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotIn(List<Integer> values) {
            addCriterion("islock not in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockBetween(Integer value1, Integer value2) {
            addCriterion("islock between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotBetween(Integer value1, Integer value2) {
            addCriterion("islock not between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIsNull() {
            addCriterion("invite_userid is null");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIsNotNull() {
            addCriterion("invite_userid is not null");
            return (Criteria) this;
        }

        public Criteria andInviteUseridEqualTo(String value) {
            addCriterion("invite_userid =", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotEqualTo(String value) {
            addCriterion("invite_userid <>", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridGreaterThan(String value) {
            addCriterion("invite_userid >", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridGreaterThanOrEqualTo(String value) {
            addCriterion("invite_userid >=", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridLessThan(String value) {
            addCriterion("invite_userid <", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridLessThanOrEqualTo(String value) {
            addCriterion("invite_userid <=", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridLike(String value) {
            addCriterion("invite_userid like", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotLike(String value) {
            addCriterion("invite_userid not like", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIn(List<String> values) {
            addCriterion("invite_userid in", values, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotIn(List<String> values) {
            addCriterion("invite_userid not in", values, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridBetween(String value1, String value2) {
            addCriterion("invite_userid between", value1, value2, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotBetween(String value1, String value2) {
            addCriterion("invite_userid not between", value1, value2, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyIsNull() {
            addCriterion("invite_money is null");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyIsNotNull() {
            addCriterion("invite_money is not null");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyEqualTo(String value) {
            addCriterion("invite_money =", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotEqualTo(String value) {
            addCriterion("invite_money <>", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyGreaterThan(String value) {
            addCriterion("invite_money >", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("invite_money >=", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyLessThan(String value) {
            addCriterion("invite_money <", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyLessThanOrEqualTo(String value) {
            addCriterion("invite_money <=", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyLike(String value) {
            addCriterion("invite_money like", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotLike(String value) {
            addCriterion("invite_money not like", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyIn(List<String> values) {
            addCriterion("invite_money in", values, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotIn(List<String> values) {
            addCriterion("invite_money not in", values, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyBetween(String value1, String value2) {
            addCriterion("invite_money between", value1, value2, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotBetween(String value1, String value2) {
            addCriterion("invite_money not between", value1, value2, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andRealStatusIsNull() {
            addCriterion("real_status is null");
            return (Criteria) this;
        }

        public Criteria andRealStatusIsNotNull() {
            addCriterion("real_status is not null");
            return (Criteria) this;
        }

        public Criteria andRealStatusEqualTo(String value) {
            addCriterion("real_status =", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotEqualTo(String value) {
            addCriterion("real_status <>", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusGreaterThan(String value) {
            addCriterion("real_status >", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusGreaterThanOrEqualTo(String value) {
            addCriterion("real_status >=", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLessThan(String value) {
            addCriterion("real_status <", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLessThanOrEqualTo(String value) {
            addCriterion("real_status <=", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLike(String value) {
            addCriterion("real_status like", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotLike(String value) {
            addCriterion("real_status not like", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusIn(List<String> values) {
            addCriterion("real_status in", values, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotIn(List<String> values) {
            addCriterion("real_status not in", values, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusBetween(String value1, String value2) {
            addCriterion("real_status between", value1, value2, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotBetween(String value1, String value2) {
            addCriterion("real_status not between", value1, value2, "realStatus");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("card_type like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("card_type not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardPic1IsNull() {
            addCriterion("card_pic1 is null");
            return (Criteria) this;
        }

        public Criteria andCardPic1IsNotNull() {
            addCriterion("card_pic1 is not null");
            return (Criteria) this;
        }

        public Criteria andCardPic1EqualTo(String value) {
            addCriterion("card_pic1 =", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotEqualTo(String value) {
            addCriterion("card_pic1 <>", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1GreaterThan(String value) {
            addCriterion("card_pic1 >", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1GreaterThanOrEqualTo(String value) {
            addCriterion("card_pic1 >=", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1LessThan(String value) {
            addCriterion("card_pic1 <", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1LessThanOrEqualTo(String value) {
            addCriterion("card_pic1 <=", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1Like(String value) {
            addCriterion("card_pic1 like", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotLike(String value) {
            addCriterion("card_pic1 not like", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1In(List<String> values) {
            addCriterion("card_pic1 in", values, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotIn(List<String> values) {
            addCriterion("card_pic1 not in", values, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1Between(String value1, String value2) {
            addCriterion("card_pic1 between", value1, value2, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotBetween(String value1, String value2) {
            addCriterion("card_pic1 not between", value1, value2, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic2IsNull() {
            addCriterion("card_pic2 is null");
            return (Criteria) this;
        }

        public Criteria andCardPic2IsNotNull() {
            addCriterion("card_pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andCardPic2EqualTo(String value) {
            addCriterion("card_pic2 =", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotEqualTo(String value) {
            addCriterion("card_pic2 <>", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2GreaterThan(String value) {
            addCriterion("card_pic2 >", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2GreaterThanOrEqualTo(String value) {
            addCriterion("card_pic2 >=", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2LessThan(String value) {
            addCriterion("card_pic2 <", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2LessThanOrEqualTo(String value) {
            addCriterion("card_pic2 <=", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2Like(String value) {
            addCriterion("card_pic2 like", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotLike(String value) {
            addCriterion("card_pic2 not like", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2In(List<String> values) {
            addCriterion("card_pic2 in", values, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotIn(List<String> values) {
            addCriterion("card_pic2 not in", values, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2Between(String value1, String value2) {
            addCriterion("card_pic2 between", value1, value2, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotBetween(String value1, String value2) {
            addCriterion("card_pic2 not between", value1, value2, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusIsNull() {
            addCriterion("card_pic_status is null");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusIsNotNull() {
            addCriterion("card_pic_status is not null");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusEqualTo(String value) {
            addCriterion("card_pic_status =", value, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusNotEqualTo(String value) {
            addCriterion("card_pic_status <>", value, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusGreaterThan(String value) {
            addCriterion("card_pic_status >", value, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusGreaterThanOrEqualTo(String value) {
            addCriterion("card_pic_status >=", value, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusLessThan(String value) {
            addCriterion("card_pic_status <", value, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusLessThanOrEqualTo(String value) {
            addCriterion("card_pic_status <=", value, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusLike(String value) {
            addCriterion("card_pic_status like", value, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusNotLike(String value) {
            addCriterion("card_pic_status not like", value, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusIn(List<String> values) {
            addCriterion("card_pic_status in", values, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusNotIn(List<String> values) {
            addCriterion("card_pic_status not in", values, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusBetween(String value1, String value2) {
            addCriterion("card_pic_status between", value1, value2, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andCardPicStatusNotBetween(String value1, String value2) {
            addCriterion("card_pic_status not between", value1, value2, "cardPicStatus");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralIsNull() {
            addCriterion("invest_integral is null");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralIsNotNull() {
            addCriterion("invest_integral is not null");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralEqualTo(Integer value) {
            addCriterion("invest_integral =", value, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralNotEqualTo(Integer value) {
            addCriterion("invest_integral <>", value, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralGreaterThan(Integer value) {
            addCriterion("invest_integral >", value, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("invest_integral >=", value, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralLessThan(Integer value) {
            addCriterion("invest_integral <", value, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("invest_integral <=", value, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralIn(List<Integer> values) {
            addCriterion("invest_integral in", values, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralNotIn(List<Integer> values) {
            addCriterion("invest_integral not in", values, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralBetween(Integer value1, Integer value2) {
            addCriterion("invest_integral between", value1, value2, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andInvestIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("invest_integral not between", value1, value2, "investIntegral");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusIsNull() {
            addCriterion("avatar_status is null");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusIsNotNull() {
            addCriterion("avatar_status is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusEqualTo(Integer value) {
            addCriterion("avatar_status =", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusNotEqualTo(Integer value) {
            addCriterion("avatar_status <>", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusGreaterThan(Integer value) {
            addCriterion("avatar_status >", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("avatar_status >=", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusLessThan(Integer value) {
            addCriterion("avatar_status <", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusLessThanOrEqualTo(Integer value) {
            addCriterion("avatar_status <=", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusIn(List<Integer> values) {
            addCriterion("avatar_status in", values, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusNotIn(List<Integer> values) {
            addCriterion("avatar_status not in", values, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusBetween(Integer value1, Integer value2) {
            addCriterion("avatar_status between", value1, value2, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("avatar_status not between", value1, value2, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNull() {
            addCriterion("email_status is null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNotNull() {
            addCriterion("email_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusEqualTo(String value) {
            addCriterion("email_status =", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotEqualTo(String value) {
            addCriterion("email_status <>", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThan(String value) {
            addCriterion("email_status >", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThanOrEqualTo(String value) {
            addCriterion("email_status >=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThan(String value) {
            addCriterion("email_status <", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThanOrEqualTo(String value) {
            addCriterion("email_status <=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLike(String value) {
            addCriterion("email_status like", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotLike(String value) {
            addCriterion("email_status not like", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIn(List<String> values) {
            addCriterion("email_status in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotIn(List<String> values) {
            addCriterion("email_status not in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusBetween(String value1, String value2) {
            addCriterion("email_status between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotBetween(String value1, String value2) {
            addCriterion("email_status not between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIsNull() {
            addCriterion("phone_status is null");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIsNotNull() {
            addCriterion("phone_status is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusEqualTo(String value) {
            addCriterion("phone_status =", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotEqualTo(String value) {
            addCriterion("phone_status <>", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusGreaterThan(String value) {
            addCriterion("phone_status >", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusGreaterThanOrEqualTo(String value) {
            addCriterion("phone_status >=", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusLessThan(String value) {
            addCriterion("phone_status <", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusLessThanOrEqualTo(String value) {
            addCriterion("phone_status <=", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusLike(String value) {
            addCriterion("phone_status like", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotLike(String value) {
            addCriterion("phone_status not like", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIn(List<String> values) {
            addCriterion("phone_status in", values, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotIn(List<String> values) {
            addCriterion("phone_status not in", values, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusBetween(String value1, String value2) {
            addCriterion("phone_status between", value1, value2, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotBetween(String value1, String value2) {
            addCriterion("phone_status not between", value1, value2, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNull() {
            addCriterion("video_status is null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNotNull() {
            addCriterion("video_status is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusEqualTo(Integer value) {
            addCriterion("video_status =", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotEqualTo(Integer value) {
            addCriterion("video_status <>", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThan(Integer value) {
            addCriterion("video_status >", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_status >=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThan(Integer value) {
            addCriterion("video_status <", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("video_status <=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIn(List<Integer> values) {
            addCriterion("video_status in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotIn(List<Integer> values) {
            addCriterion("video_status not in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusBetween(Integer value1, Integer value2) {
            addCriterion("video_status between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("video_status not between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNull() {
            addCriterion("scene_status is null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNotNull() {
            addCriterion("scene_status is not null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusEqualTo(Integer value) {
            addCriterion("scene_status =", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotEqualTo(Integer value) {
            addCriterion("scene_status <>", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThan(Integer value) {
            addCriterion("scene_status >", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_status >=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThan(Integer value) {
            addCriterion("scene_status <", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThanOrEqualTo(Integer value) {
            addCriterion("scene_status <=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIn(List<Integer> values) {
            addCriterion("scene_status in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotIn(List<Integer> values) {
            addCriterion("scene_status not in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusBetween(Integer value1, Integer value2) {
            addCriterion("scene_status between", value1, value2, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_status not between", value1, value2, "sceneStatus");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andLitpicIsNull() {
            addCriterion("litpic is null");
            return (Criteria) this;
        }

        public Criteria andLitpicIsNotNull() {
            addCriterion("litpic is not null");
            return (Criteria) this;
        }

        public Criteria andLitpicEqualTo(String value) {
            addCriterion("litpic =", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotEqualTo(String value) {
            addCriterion("litpic <>", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicGreaterThan(String value) {
            addCriterion("litpic >", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicGreaterThanOrEqualTo(String value) {
            addCriterion("litpic >=", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicLessThan(String value) {
            addCriterion("litpic <", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicLessThanOrEqualTo(String value) {
            addCriterion("litpic <=", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicLike(String value) {
            addCriterion("litpic like", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotLike(String value) {
            addCriterion("litpic not like", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicIn(List<String> values) {
            addCriterion("litpic in", values, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotIn(List<String> values) {
            addCriterion("litpic not in", values, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicBetween(String value1, String value2) {
            addCriterion("litpic between", value1, value2, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotBetween(String value1, String value2) {
            addCriterion("litpic not between", value1, value2, "litpic");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
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

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWangwangIsNull() {
            addCriterion("wangwang is null");
            return (Criteria) this;
        }

        public Criteria andWangwangIsNotNull() {
            addCriterion("wangwang is not null");
            return (Criteria) this;
        }

        public Criteria andWangwangEqualTo(String value) {
            addCriterion("wangwang =", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangNotEqualTo(String value) {
            addCriterion("wangwang <>", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangGreaterThan(String value) {
            addCriterion("wangwang >", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangGreaterThanOrEqualTo(String value) {
            addCriterion("wangwang >=", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangLessThan(String value) {
            addCriterion("wangwang <", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangLessThanOrEqualTo(String value) {
            addCriterion("wangwang <=", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangLike(String value) {
            addCriterion("wangwang like", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangNotLike(String value) {
            addCriterion("wangwang not like", value, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangIn(List<String> values) {
            addCriterion("wangwang in", values, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangNotIn(List<String> values) {
            addCriterion("wangwang not in", values, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangBetween(String value1, String value2) {
            addCriterion("wangwang between", value1, value2, "wangwang");
            return (Criteria) this;
        }

        public Criteria andWangwangNotBetween(String value1, String value2) {
            addCriterion("wangwang not between", value1, value2, "wangwang");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(String value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(String value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(String value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(String value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(String value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLike(String value) {
            addCriterion("question like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotLike(String value) {
            addCriterion("question not like", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<String> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<String> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(String value1, String value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(String value1, String value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("logintime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("logintime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Integer value) {
            addCriterion("logintime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Integer value) {
            addCriterion("logintime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Integer value) {
            addCriterion("logintime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("logintime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Integer value) {
            addCriterion("logintime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Integer value) {
            addCriterion("logintime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Integer> values) {
            addCriterion("logintime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Integer> values) {
            addCriterion("logintime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Integer value1, Integer value2) {
            addCriterion("logintime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Integer value1, Integer value2) {
            addCriterion("logintime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(String value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(String value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(String value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(String value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(String value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLike(String value) {
            addCriterion("addtime like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotLike(String value) {
            addCriterion("addtime not like", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<String> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<String> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(String value1, String value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(String value1, String value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddipIsNull() {
            addCriterion("addip is null");
            return (Criteria) this;
        }

        public Criteria andAddipIsNotNull() {
            addCriterion("addip is not null");
            return (Criteria) this;
        }

        public Criteria andAddipEqualTo(String value) {
            addCriterion("addip =", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotEqualTo(String value) {
            addCriterion("addip <>", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipGreaterThan(String value) {
            addCriterion("addip >", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipGreaterThanOrEqualTo(String value) {
            addCriterion("addip >=", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLessThan(String value) {
            addCriterion("addip <", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLessThanOrEqualTo(String value) {
            addCriterion("addip <=", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLike(String value) {
            addCriterion("addip like", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotLike(String value) {
            addCriterion("addip not like", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipIn(List<String> values) {
            addCriterion("addip in", values, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotIn(List<String> values) {
            addCriterion("addip not in", values, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipBetween(String value1, String value2) {
            addCriterion("addip between", value1, value2, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotBetween(String value1, String value2) {
            addCriterion("addip not between", value1, value2, "addip");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(String value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(String value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(String value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(String value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(String value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLike(String value) {
            addCriterion("uptime like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotLike(String value) {
            addCriterion("uptime not like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<String> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<String> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(String value1, String value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(String value1, String value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUpipIsNull() {
            addCriterion("upip is null");
            return (Criteria) this;
        }

        public Criteria andUpipIsNotNull() {
            addCriterion("upip is not null");
            return (Criteria) this;
        }

        public Criteria andUpipEqualTo(String value) {
            addCriterion("upip =", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipNotEqualTo(String value) {
            addCriterion("upip <>", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipGreaterThan(String value) {
            addCriterion("upip >", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipGreaterThanOrEqualTo(String value) {
            addCriterion("upip >=", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipLessThan(String value) {
            addCriterion("upip <", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipLessThanOrEqualTo(String value) {
            addCriterion("upip <=", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipLike(String value) {
            addCriterion("upip like", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipNotLike(String value) {
            addCriterion("upip not like", value, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipIn(List<String> values) {
            addCriterion("upip in", values, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipNotIn(List<String> values) {
            addCriterion("upip not in", values, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipBetween(String value1, String value2) {
            addCriterion("upip between", value1, value2, "upip");
            return (Criteria) this;
        }

        public Criteria andUpipNotBetween(String value1, String value2) {
            addCriterion("upip not between", value1, value2, "upip");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("lasttime is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(String value) {
            addCriterion("lasttime =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(String value) {
            addCriterion("lasttime <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(String value) {
            addCriterion("lasttime >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("lasttime >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(String value) {
            addCriterion("lasttime <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(String value) {
            addCriterion("lasttime <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLike(String value) {
            addCriterion("lasttime like", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotLike(String value) {
            addCriterion("lasttime not like", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<String> values) {
            addCriterion("lasttime in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<String> values) {
            addCriterion("lasttime not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(String value1, String value2) {
            addCriterion("lasttime between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(String value1, String value2) {
            addCriterion("lasttime not between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLastipIsNull() {
            addCriterion("lastip is null");
            return (Criteria) this;
        }

        public Criteria andLastipIsNotNull() {
            addCriterion("lastip is not null");
            return (Criteria) this;
        }

        public Criteria andLastipEqualTo(String value) {
            addCriterion("lastip =", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotEqualTo(String value) {
            addCriterion("lastip <>", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipGreaterThan(String value) {
            addCriterion("lastip >", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipGreaterThanOrEqualTo(String value) {
            addCriterion("lastip >=", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLessThan(String value) {
            addCriterion("lastip <", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLessThanOrEqualTo(String value) {
            addCriterion("lastip <=", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipLike(String value) {
            addCriterion("lastip like", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotLike(String value) {
            addCriterion("lastip not like", value, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipIn(List<String> values) {
            addCriterion("lastip in", values, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotIn(List<String> values) {
            addCriterion("lastip not in", values, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipBetween(String value1, String value2) {
            addCriterion("lastip between", value1, value2, "lastip");
            return (Criteria) this;
        }

        public Criteria andLastipNotBetween(String value1, String value2) {
            addCriterion("lastip not between", value1, value2, "lastip");
            return (Criteria) this;
        }

        public Criteria andChongzuIdIsNull() {
            addCriterion("chongzu_id is null");
            return (Criteria) this;
        }

        public Criteria andChongzuIdIsNotNull() {
            addCriterion("chongzu_id is not null");
            return (Criteria) this;
        }

        public Criteria andChongzuIdEqualTo(Integer value) {
            addCriterion("chongzu_id =", value, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andChongzuIdNotEqualTo(Integer value) {
            addCriterion("chongzu_id <>", value, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andChongzuIdGreaterThan(Integer value) {
            addCriterion("chongzu_id >", value, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andChongzuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chongzu_id >=", value, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andChongzuIdLessThan(Integer value) {
            addCriterion("chongzu_id <", value, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andChongzuIdLessThanOrEqualTo(Integer value) {
            addCriterion("chongzu_id <=", value, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andChongzuIdIn(List<Integer> values) {
            addCriterion("chongzu_id in", values, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andChongzuIdNotIn(List<Integer> values) {
            addCriterion("chongzu_id not in", values, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andChongzuIdBetween(Integer value1, Integer value2) {
            addCriterion("chongzu_id between", value1, value2, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andChongzuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chongzu_id not between", value1, value2, "chongzuId");
            return (Criteria) this;
        }

        public Criteria andCzMoneyIsNull() {
            addCriterion("cz_money is null");
            return (Criteria) this;
        }

        public Criteria andCzMoneyIsNotNull() {
            addCriterion("cz_money is not null");
            return (Criteria) this;
        }

        public Criteria andCzMoneyEqualTo(BigDecimal value) {
            addCriterion("cz_money =", value, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzMoneyNotEqualTo(BigDecimal value) {
            addCriterion("cz_money <>", value, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzMoneyGreaterThan(BigDecimal value) {
            addCriterion("cz_money >", value, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cz_money >=", value, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzMoneyLessThan(BigDecimal value) {
            addCriterion("cz_money <", value, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cz_money <=", value, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzMoneyIn(List<BigDecimal> values) {
            addCriterion("cz_money in", values, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzMoneyNotIn(List<BigDecimal> values) {
            addCriterion("cz_money not in", values, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cz_money between", value1, value2, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cz_money not between", value1, value2, "czMoney");
            return (Criteria) this;
        }

        public Criteria andCzCashIsNull() {
            addCriterion("cz_cash is null");
            return (Criteria) this;
        }

        public Criteria andCzCashIsNotNull() {
            addCriterion("cz_cash is not null");
            return (Criteria) this;
        }

        public Criteria andCzCashEqualTo(BigDecimal value) {
            addCriterion("cz_cash =", value, "czCash");
            return (Criteria) this;
        }

        public Criteria andCzCashNotEqualTo(BigDecimal value) {
            addCriterion("cz_cash <>", value, "czCash");
            return (Criteria) this;
        }

        public Criteria andCzCashGreaterThan(BigDecimal value) {
            addCriterion("cz_cash >", value, "czCash");
            return (Criteria) this;
        }

        public Criteria andCzCashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cz_cash >=", value, "czCash");
            return (Criteria) this;
        }

        public Criteria andCzCashLessThan(BigDecimal value) {
            addCriterion("cz_cash <", value, "czCash");
            return (Criteria) this;
        }

        public Criteria andCzCashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cz_cash <=", value, "czCash");
            return (Criteria) this;
        }

        public Criteria andCzCashIn(List<BigDecimal> values) {
            addCriterion("cz_cash in", values, "czCash");
            return (Criteria) this;
        }

        public Criteria andCzCashNotIn(List<BigDecimal> values) {
            addCriterion("cz_cash not in", values, "czCash");
            return (Criteria) this;
        }

        public Criteria andCzCashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cz_cash between", value1, value2, "czCash");
            return (Criteria) this;
        }

        public Criteria andCzCashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cz_cash not between", value1, value2, "czCash");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdIsNull() {
            addCriterion("chongzu_new_id is null");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdIsNotNull() {
            addCriterion("chongzu_new_id is not null");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdEqualTo(Integer value) {
            addCriterion("chongzu_new_id =", value, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdNotEqualTo(Integer value) {
            addCriterion("chongzu_new_id <>", value, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdGreaterThan(Integer value) {
            addCriterion("chongzu_new_id >", value, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chongzu_new_id >=", value, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdLessThan(Integer value) {
            addCriterion("chongzu_new_id <", value, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdLessThanOrEqualTo(Integer value) {
            addCriterion("chongzu_new_id <=", value, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdIn(List<Integer> values) {
            addCriterion("chongzu_new_id in", values, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdNotIn(List<Integer> values) {
            addCriterion("chongzu_new_id not in", values, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdBetween(Integer value1, Integer value2) {
            addCriterion("chongzu_new_id between", value1, value2, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andChongzuNewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chongzu_new_id not between", value1, value2, "chongzuNewId");
            return (Criteria) this;
        }

        public Criteria andIdcardpicIsNull() {
            addCriterion("idcardpic is null");
            return (Criteria) this;
        }

        public Criteria andIdcardpicIsNotNull() {
            addCriterion("idcardpic is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardpicEqualTo(Integer value) {
            addCriterion("idcardpic =", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicNotEqualTo(Integer value) {
            addCriterion("idcardpic <>", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicGreaterThan(Integer value) {
            addCriterion("idcardpic >", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicGreaterThanOrEqualTo(Integer value) {
            addCriterion("idcardpic >=", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicLessThan(Integer value) {
            addCriterion("idcardpic <", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicLessThanOrEqualTo(Integer value) {
            addCriterion("idcardpic <=", value, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicIn(List<Integer> values) {
            addCriterion("idcardpic in", values, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicNotIn(List<Integer> values) {
            addCriterion("idcardpic not in", values, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicBetween(Integer value1, Integer value2) {
            addCriterion("idcardpic between", value1, value2, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andIdcardpicNotBetween(Integer value1, Integer value2) {
            addCriterion("idcardpic not between", value1, value2, "idcardpic");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("channel_code =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("channel_code <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("channel_code like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("channel_code not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("channel_code in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeIsNull() {
            addCriterion("sub_channel_code is null");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeIsNotNull() {
            addCriterion("sub_channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeEqualTo(String value) {
            addCriterion("sub_channel_code =", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeNotEqualTo(String value) {
            addCriterion("sub_channel_code <>", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeGreaterThan(String value) {
            addCriterion("sub_channel_code >", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_channel_code >=", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeLessThan(String value) {
            addCriterion("sub_channel_code <", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("sub_channel_code <=", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeLike(String value) {
            addCriterion("sub_channel_code like", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeNotLike(String value) {
            addCriterion("sub_channel_code not like", value, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeIn(List<String> values) {
            addCriterion("sub_channel_code in", values, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeNotIn(List<String> values) {
            addCriterion("sub_channel_code not in", values, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeBetween(String value1, String value2) {
            addCriterion("sub_channel_code between", value1, value2, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSubChannelCodeNotBetween(String value1, String value2) {
            addCriterion("sub_channel_code not between", value1, value2, "subChannelCode");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Boolean value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Boolean value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Boolean value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Boolean value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Boolean value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Boolean> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Boolean> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Boolean value1, Boolean value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("source not between", value1, value2, "source");
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