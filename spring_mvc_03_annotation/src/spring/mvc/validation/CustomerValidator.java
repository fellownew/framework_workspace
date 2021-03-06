package spring.mvc.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.mvc.vo.Customer;


/* valiodation 구현
 * 1. validator를 implements 후 메소드 오버라이드.
 * 
 */

public class CustomerValidator implements Validator{

	@Override
	//validation 검증 하고자 하는 객체(VO)가 검증 할 수 있는 타입인지 체크.
	//매개변수 : Class객체 - 검증하려는 객체의 Class객체.
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Customer.class); // a.isAssignableForm(b) : a와b가 같은 클래스를 표현하는 Class인지 체크하여 boolean으로 리턴
	}

	@Override
	//실제 검증 작업을 할 메소드.
	//매개변수 : 1. 검증할 객체 (VO) , 2.검증도중 오류 발생시 오류 정보를 설정할 Erros객체.
	public void validate(Object target, Errors errors) {
		/*
		 * Errors 오류 등록.
		 * reject() - target 자체의 오류 설정.
		 * rejectValue() - 필드(instance 변수) 단위 오류 설정.
		 */
		Customer cust = (Customer)target;
		//id - not null, 글자수 6이상.
		//password,이름,이메일 not null.
		//취미, 관심분야 - 1개 이상 선택.
		String id = cust.getId();
		if(id==null||id.trim().isEmpty()){
			errors.rejectValue("id", "required",null,"ID를 넣으세요");//매겨변수 : 1-검증실패한 property명 2-에러(메시지)코드, 3-{0}에 넣을 값, 4-기본 에러 메시지.
		}
		if(id!=null && id.length()<6){
			errors.rejectValue("id", "minlength", new Object[]{6}, "ID는 6글자 이상 넣으세요");
		}
		//validationUtils - 특정 필드(요청 파라미터)의 값이 있는지 없는지 체크하는 메소드 제공.
		ValidationUtils.rejectIfEmpty(errors, "password", "required"); // null,""(length==0) 실패,
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required");//null,""(lignth==0) 실패, 공백- (trim까지 적용)
	}
	
}
