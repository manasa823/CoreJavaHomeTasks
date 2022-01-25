package predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task9 {

	public static void main(String[] args) {
		
		ResponseCls r1 = new ResponseCls("invalid request message framing",400,"application/json; charset=utf-8");
		ResponseCls r2 = new ResponseCls("OK",200,"text/html");
		ResponseCls r3 = new ResponseCls("Forbidden",403,"application/json");
		ResponseCls r4 = new ResponseCls("malformed request syntax",400,"multipart/form-data");
		ResponseCls r5 = new ResponseCls("Internal Server Error",500,"application/json");
		
		List<ResponseCls> list = new ArrayList<>();
		
		list.add(r5);
		list.add(r4);
		list.add(r3);
		list.add(r2);
		list.add(r1);
		
		Predicate<String> predicate1 =  Task7::checkType;
		Predicate<Integer> predicate2 =  Task6::checkStatus;
		
		for(ResponseCls r:list) {
			if(predicate1.test(r.getResponseType())||predicate2.test(r.getStatusCode()))
				System.out.println(r.getResponseBody());
		}
	}
}
