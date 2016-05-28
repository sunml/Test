package mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {
    private Long userId;

    private Integer typeId;

    private Integer order;

    private String purview;

    private String username;

    private String password;

    private String paypassword;

    private Integer islock;

    private String inviteUserid;

    private String inviteMoney;

    private String realStatus;

    private String cardType;

    private String cardId;

    private String cardPic1;

    private String cardPic2;

    private String cardPicStatus;

    private String nation;

    private String realname;

    private Integer investIntegral;

    private Integer integral;

    private Integer status;

    private Integer avatarStatus;

    private String emailStatus;

    private String phoneStatus;

    private Integer videoStatus;

    private Integer sceneStatus;

    private String email;

    private String sex;

    private String litpic;

    private String tel;

    private String phone;

    private String qq;

    private String wangwang;

    private String question;

    private String answer;

    private String birthday;

    private String province;

    private String city;

    private String area;

    private String address;

    private Integer logintime;

    private String addtime;

    private String addip;

    private String uptime;

    private String upip;

    private String lasttime;

    private String lastip;

    private Integer chongzuId;

    private BigDecimal czMoney;

    private BigDecimal czCash;

    private Integer chongzuNewId;

    private Integer idcardpic;

    private String job;

    private String channelCode;

    private String subChannelCode;

    private Boolean source;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getPurview() {
        return purview;
    }

    public void setPurview(String purview) {
        this.purview = purview == null ? null : purview.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public String getInviteUserid() {
        return inviteUserid;
    }

    public void setInviteUserid(String inviteUserid) {
        this.inviteUserid = inviteUserid == null ? null : inviteUserid.trim();
    }

    public String getInviteMoney() {
        return inviteMoney;
    }

    public void setInviteMoney(String inviteMoney) {
        this.inviteMoney = inviteMoney == null ? null : inviteMoney.trim();
    }

    public String getRealStatus() {
        return realStatus;
    }

    public void setRealStatus(String realStatus) {
        this.realStatus = realStatus == null ? null : realStatus.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getCardPic1() {
        return cardPic1;
    }

    public void setCardPic1(String cardPic1) {
        this.cardPic1 = cardPic1 == null ? null : cardPic1.trim();
    }

    public String getCardPic2() {
        return cardPic2;
    }

    public void setCardPic2(String cardPic2) {
        this.cardPic2 = cardPic2 == null ? null : cardPic2.trim();
    }

    public String getCardPicStatus() {
        return cardPicStatus;
    }

    public void setCardPicStatus(String cardPicStatus) {
        this.cardPicStatus = cardPicStatus == null ? null : cardPicStatus.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getInvestIntegral() {
        return investIntegral;
    }

    public void setInvestIntegral(Integer investIntegral) {
        this.investIntegral = investIntegral;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAvatarStatus() {
        return avatarStatus;
    }

    public void setAvatarStatus(Integer avatarStatus) {
        this.avatarStatus = avatarStatus;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus == null ? null : emailStatus.trim();
    }

    public String getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(String phoneStatus) {
        this.phoneStatus = phoneStatus == null ? null : phoneStatus.trim();
    }

    public Integer getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Integer videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Integer getSceneStatus() {
        return sceneStatus;
    }

    public void setSceneStatus(Integer sceneStatus) {
        this.sceneStatus = sceneStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic == null ? null : litpic.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWangwang() {
        return wangwang;
    }

    public void setWangwang(String wangwang) {
        this.wangwang = wangwang == null ? null : wangwang.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getLogintime() {
        return logintime;
    }

    public void setLogintime(Integer logintime) {
        this.logintime = logintime;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    public String getAddip() {
        return addip;
    }

    public void setAddip(String addip) {
        this.addip = addip == null ? null : addip.trim();
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }

    public String getUpip() {
        return upip;
    }

    public void setUpip(String upip) {
        this.upip = upip == null ? null : upip.trim();
    }

    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime == null ? null : lasttime.trim();
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip == null ? null : lastip.trim();
    }

    public Integer getChongzuId() {
        return chongzuId;
    }

    public void setChongzuId(Integer chongzuId) {
        this.chongzuId = chongzuId;
    }

    public BigDecimal getCzMoney() {
        return czMoney;
    }

    public void setCzMoney(BigDecimal czMoney) {
        this.czMoney = czMoney;
    }

    public BigDecimal getCzCash() {
        return czCash;
    }

    public void setCzCash(BigDecimal czCash) {
        this.czCash = czCash;
    }

    public Integer getChongzuNewId() {
        return chongzuNewId;
    }

    public void setChongzuNewId(Integer chongzuNewId) {
        this.chongzuNewId = chongzuNewId;
    }

    public Integer getIdcardpic() {
        return idcardpic;
    }

    public void setIdcardpic(Integer idcardpic) {
        this.idcardpic = idcardpic;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getSubChannelCode() {
        return subChannelCode;
    }

    public void setSubChannelCode(String subChannelCode) {
        this.subChannelCode = subChannelCode == null ? null : subChannelCode.trim();
    }

    public Boolean getSource() {
        return source;
    }

    public void setSource(Boolean source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getOrder() == null ? other.getOrder() == null : this.getOrder().equals(other.getOrder()))
            && (this.getPurview() == null ? other.getPurview() == null : this.getPurview().equals(other.getPurview()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPaypassword() == null ? other.getPaypassword() == null : this.getPaypassword().equals(other.getPaypassword()))
            && (this.getIslock() == null ? other.getIslock() == null : this.getIslock().equals(other.getIslock()))
            && (this.getInviteUserid() == null ? other.getInviteUserid() == null : this.getInviteUserid().equals(other.getInviteUserid()))
            && (this.getInviteMoney() == null ? other.getInviteMoney() == null : this.getInviteMoney().equals(other.getInviteMoney()))
            && (this.getRealStatus() == null ? other.getRealStatus() == null : this.getRealStatus().equals(other.getRealStatus()))
            && (this.getCardType() == null ? other.getCardType() == null : this.getCardType().equals(other.getCardType()))
            && (this.getCardId() == null ? other.getCardId() == null : this.getCardId().equals(other.getCardId()))
            && (this.getCardPic1() == null ? other.getCardPic1() == null : this.getCardPic1().equals(other.getCardPic1()))
            && (this.getCardPic2() == null ? other.getCardPic2() == null : this.getCardPic2().equals(other.getCardPic2()))
            && (this.getCardPicStatus() == null ? other.getCardPicStatus() == null : this.getCardPicStatus().equals(other.getCardPicStatus()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getInvestIntegral() == null ? other.getInvestIntegral() == null : this.getInvestIntegral().equals(other.getInvestIntegral()))
            && (this.getIntegral() == null ? other.getIntegral() == null : this.getIntegral().equals(other.getIntegral()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAvatarStatus() == null ? other.getAvatarStatus() == null : this.getAvatarStatus().equals(other.getAvatarStatus()))
            && (this.getEmailStatus() == null ? other.getEmailStatus() == null : this.getEmailStatus().equals(other.getEmailStatus()))
            && (this.getPhoneStatus() == null ? other.getPhoneStatus() == null : this.getPhoneStatus().equals(other.getPhoneStatus()))
            && (this.getVideoStatus() == null ? other.getVideoStatus() == null : this.getVideoStatus().equals(other.getVideoStatus()))
            && (this.getSceneStatus() == null ? other.getSceneStatus() == null : this.getSceneStatus().equals(other.getSceneStatus()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getLitpic() == null ? other.getLitpic() == null : this.getLitpic().equals(other.getLitpic()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getWangwang() == null ? other.getWangwang() == null : this.getWangwang().equals(other.getWangwang()))
            && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLogintime() == null ? other.getLogintime() == null : this.getLogintime().equals(other.getLogintime()))
            && (this.getAddtime() == null ? other.getAddtime() == null : this.getAddtime().equals(other.getAddtime()))
            && (this.getAddip() == null ? other.getAddip() == null : this.getAddip().equals(other.getAddip()))
            && (this.getUptime() == null ? other.getUptime() == null : this.getUptime().equals(other.getUptime()))
            && (this.getUpip() == null ? other.getUpip() == null : this.getUpip().equals(other.getUpip()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()))
            && (this.getLastip() == null ? other.getLastip() == null : this.getLastip().equals(other.getLastip()))
            && (this.getChongzuId() == null ? other.getChongzuId() == null : this.getChongzuId().equals(other.getChongzuId()))
            && (this.getCzMoney() == null ? other.getCzMoney() == null : this.getCzMoney().equals(other.getCzMoney()))
            && (this.getCzCash() == null ? other.getCzCash() == null : this.getCzCash().equals(other.getCzCash()))
            && (this.getChongzuNewId() == null ? other.getChongzuNewId() == null : this.getChongzuNewId().equals(other.getChongzuNewId()))
            && (this.getIdcardpic() == null ? other.getIdcardpic() == null : this.getIdcardpic().equals(other.getIdcardpic()))
            && (this.getJob() == null ? other.getJob() == null : this.getJob().equals(other.getJob()))
            && (this.getChannelCode() == null ? other.getChannelCode() == null : this.getChannelCode().equals(other.getChannelCode()))
            && (this.getSubChannelCode() == null ? other.getSubChannelCode() == null : this.getSubChannelCode().equals(other.getSubChannelCode()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getOrder() == null) ? 0 : getOrder().hashCode());
        result = prime * result + ((getPurview() == null) ? 0 : getPurview().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPaypassword() == null) ? 0 : getPaypassword().hashCode());
        result = prime * result + ((getIslock() == null) ? 0 : getIslock().hashCode());
        result = prime * result + ((getInviteUserid() == null) ? 0 : getInviteUserid().hashCode());
        result = prime * result + ((getInviteMoney() == null) ? 0 : getInviteMoney().hashCode());
        result = prime * result + ((getRealStatus() == null) ? 0 : getRealStatus().hashCode());
        result = prime * result + ((getCardType() == null) ? 0 : getCardType().hashCode());
        result = prime * result + ((getCardId() == null) ? 0 : getCardId().hashCode());
        result = prime * result + ((getCardPic1() == null) ? 0 : getCardPic1().hashCode());
        result = prime * result + ((getCardPic2() == null) ? 0 : getCardPic2().hashCode());
        result = prime * result + ((getCardPicStatus() == null) ? 0 : getCardPicStatus().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getInvestIntegral() == null) ? 0 : getInvestIntegral().hashCode());
        result = prime * result + ((getIntegral() == null) ? 0 : getIntegral().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAvatarStatus() == null) ? 0 : getAvatarStatus().hashCode());
        result = prime * result + ((getEmailStatus() == null) ? 0 : getEmailStatus().hashCode());
        result = prime * result + ((getPhoneStatus() == null) ? 0 : getPhoneStatus().hashCode());
        result = prime * result + ((getVideoStatus() == null) ? 0 : getVideoStatus().hashCode());
        result = prime * result + ((getSceneStatus() == null) ? 0 : getSceneStatus().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getLitpic() == null) ? 0 : getLitpic().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getWangwang() == null) ? 0 : getWangwang().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLogintime() == null) ? 0 : getLogintime().hashCode());
        result = prime * result + ((getAddtime() == null) ? 0 : getAddtime().hashCode());
        result = prime * result + ((getAddip() == null) ? 0 : getAddip().hashCode());
        result = prime * result + ((getUptime() == null) ? 0 : getUptime().hashCode());
        result = prime * result + ((getUpip() == null) ? 0 : getUpip().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        result = prime * result + ((getLastip() == null) ? 0 : getLastip().hashCode());
        result = prime * result + ((getChongzuId() == null) ? 0 : getChongzuId().hashCode());
        result = prime * result + ((getCzMoney() == null) ? 0 : getCzMoney().hashCode());
        result = prime * result + ((getCzCash() == null) ? 0 : getCzCash().hashCode());
        result = prime * result + ((getChongzuNewId() == null) ? 0 : getChongzuNewId().hashCode());
        result = prime * result + ((getIdcardpic() == null) ? 0 : getIdcardpic().hashCode());
        result = prime * result + ((getJob() == null) ? 0 : getJob().hashCode());
        result = prime * result + ((getChannelCode() == null) ? 0 : getChannelCode().hashCode());
        result = prime * result + ((getSubChannelCode() == null) ? 0 : getSubChannelCode().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        return result;
    }
}