package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonApp {
	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader ir = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(ir);
		List<Person> pList = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);

		String line = "";

		while (true) {
			line = br.readLine();
			if (line == null) {
				break;
			}
			String[] pInfo = line.split(",");
			Person p = new Person(pInfo[0], pInfo[1], pInfo[2]);
			pList.add(p);
		}
		ShowAll(pList);
		br.close();


		while (true) {
			System.out.println("등록할 친구정보를 입력해주세요     종료:q");
			String info = sc.next();
			if (info.equals("q")) {
				break;
			}
			System.out.println("친구정보를 몇번째로 저장하시겠습니까?");
			int num = sc.nextInt();
			String[] pInfo = info.split(",");
			Person p = new Person(pInfo[0], pInfo[1], pInfo[2]);
			pList.add(num-1,p);
		}
		ShowAll(pList);
		
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String str = "";
		for (int i = 0; i < pList.size(); i++) {
			str = pList.get(i).save();
			bw.write(str);
			bw.newLine();

		}
		bw.close();
		
		sc.close();
	}

	static void ShowAll(List<Person> arr) {
		for (int i = 0; i < arr.size(); i++) {
			arr.get(i).showInfo();
		}
	}

}
