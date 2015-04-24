package mybatis.hr.test;

import java.util.List;

import mybatis.hr.dao.ConsumerDAO;
import mybatis.hr.vo.Consumer;
import mybatis.hr.vo.Mileage;

public class TestConsumer {
	public static void main(String[] args) {
		ConsumerDAO dao = ConsumerDAO.getInstance();
		int cnt = dao.insertConsumer(new Consumer("id-10","5555","최영희","choi@gmail.com","010-5555-5555",25000));
		System.out.println("insert 완료 : "+cnt);
		cnt = dao.updateConsumer(new Consumer("id-1","1234","홍변경","hong@naver.com","010-4321-4231",20000));
		System.out.println("update 완료 : "+cnt);
		System.out.println("--아이디로 찾기--");
		List<Consumer> rList = dao.selectConsumerById("id-1");
		for(Consumer o:rList){
			System.out.println(o);
		}
		System.out.println("--이름으로 찾기--");
		rList = dao.selectConsumerByName("임꺽정");
		for(Consumer o:rList){
			System.out.println(o);
		}
		System.out.println("--이메일로 찾기--");
		rList = dao.selectConsumerByEmail("Lim@gmail.com");
		for(Consumer o:rList){
			System.out.println(o);
		}
		System.out.println("--마일리지로 찾기--");
		rList = dao.selectConsumerByMileageRange(new Mileage(5000,15000));
		for(Consumer o:rList){
			System.out.println(o);
		}
		
		cnt = dao.deleteConsumerById("id-2");
		System.out.println("삭제 여부 : "+cnt);

	}
}
