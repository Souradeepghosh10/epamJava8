package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicateResponse {

	public static void main(String[] args) {

		Response res1 = new Response("test response 1 body", 400, "json");
		Response res2 = new Response("test response 2 body", 200, "xml");
		Response res3 = new Response("test response 3 body", 500, "json");
		Response res4 = new Response("test response 4 body", 301, "xml");
		Response res5 = new Response("test response 5 body", 201, "json");

		ArrayList<Response> arr = new ArrayList<Response>();
		arr.add(res1);
		arr.add(res2);
		arr.add(res3);
		arr.add(res4);
		arr.add(res5);

		Predicate<Response> resCode400 = i -> {
			return i.statusCode == 400;
		};
		
		Predicate<Response> resTypeJson = i -> {
			return i.responseType.equals("json");
		};

		
		System.out.println("------------------------");
		testPredicateResponse400(resCode400, arr);
		System.out.println("------------------------");
		testPredicateResponseType(resTypeJson, arr);
		System.out.println("------------------------");
		testPredicateResponse400(resCode400.and(resTypeJson), arr);
		System.out.println("------------------------");
		testPredicateResponse400(resCode400.or(resTypeJson), arr);
		System.out.println("------------------------");
		testPredicateResponse400(resCode400.negate().and(resTypeJson), arr);
	
	}

	public static void testPredicateResponse400(Predicate<Response> preResCode, ArrayList<Response> res) {
		for (Response response : res) {
			if (preResCode.test(response)) {
				System.out.println(response.getStatusCode() + ": the response body :" + response.getResponseBody());
			}

		}
	}
	
	public static void testPredicateResponseType(Predicate<Response> preResType, ArrayList<Response> res) {
		for (Response response : res) {
			if (preResType.test(response)) {
				System.out.println(response.getResponseType() + ": the response body :" + response.getResponseBody());
			}

		}
	}



}
