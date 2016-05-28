package org.test.jaxb;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "message", propOrder = { "version", "name", "price", "by", "discount", "sh", "sex", "id", "list", "hash", "enable", "startDate" })
public class Message {

	@XmlElement(required = true)
	private Integer id;
	private String name;

	private Date startDate;
	@XmlElement(name = "price_test", required = true)
	private Double price;
	@XmlElement
	private Long version;
	private Character sex;
	@XmlAttribute
	private Boolean enable;
	private Float discount;

	@XmlElement
	private Byte by;
	private Short sh;
	@XmlElementWrapper
	@XmlElement
	private List<String> list;
	private Map<String, String> hash;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Byte getBy() {
		return by;
	}

	public void setBy(Byte by) {
		this.by = by;
	}

	public Short getSh() {
		return sh;
	}

	public void setSh(Short sh) {
		this.sh = sh;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getHash() {
		return hash;
	}

	public void setHash(Map<String, String> hash) {
		this.hash = hash;
	}

}
