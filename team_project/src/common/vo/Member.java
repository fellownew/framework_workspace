package common.vo;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable{
	private String memberId;
	private String memberPassword;
	private String memberName;
	private String memberEmail;
	private Date memberDate;
	public Member(){}
	public Member(String memberId, String memberPassword, String memberName,
			String memberEmail, Date memberDate) {
		super();
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberDate = memberDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public Date getMemberDate() {
		return memberDate;
	}
	public void setMemberDate(Date memberDate) {
		this.memberDate = memberDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((memberDate == null) ? 0 : memberDate.hashCode());
		result = prime * result
				+ ((memberEmail == null) ? 0 : memberEmail.hashCode());
		result = prime * result
				+ ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result
				+ ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result
				+ ((memberPassword == null) ? 0 : memberPassword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (memberDate == null) {
			if (other.memberDate != null)
				return false;
		} else if (!memberDate.equals(other.memberDate))
			return false;
		if (memberEmail == null) {
			if (other.memberEmail != null)
				return false;
		} else if (!memberEmail.equals(other.memberEmail))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (memberPassword == null) {
			if (other.memberPassword != null)
				return false;
		} else if (!memberPassword.equals(other.memberPassword))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPassword="
				+ memberPassword + ", memberName=" + memberName
				+ ", memberEmail=" + memberEmail + ", memberDate=" + memberDate
				+ "]";
	}
	
	
}
