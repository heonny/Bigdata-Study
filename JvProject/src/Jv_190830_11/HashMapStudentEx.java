package Jv_190830_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * HashMapStudentEx
 */
class Student {
    int id;
    String tel;
    public Student(int id, String tel) {
        this.id = id; this.tel = tel;
    }
}

public class HashMapStudentEx {
    public static void main(String[] args) {
        // 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
        HashMap<String, Student> map = new HashMap<String, Student>();

        // 3명의 학생 저장
        // 이름과 Student 객체를 쌍으로 저장
        map.put("황기태", new Student(1, "010-1111-2222"));
        map.put("한원선", new Student(2, "010-2222-3333"));
        map.put("이영희", new Student(3, "010-3333-4444"));

        System.out.println("HashMap의 요소 개수 : " + map.size());

        // 모든 학생 출력. map에 들어 있는 모든 (key, value) 쌍 출력
        Set<String> names = map.keySet();       // key 문자열을 가진 집합 Set 컬렉션 리턴
        Iterator<String> it = names.iterator(); // key 문자열을 순서대로 접근할 수 있는 Iterator 리턴

        while (it.hasNext()) {
            String name = it.next();    // 다음 키. 학생 이름
            Student student = map.get(name);    // 이름에 해당하는 Student 객체 리턴
            System.out.println(name + " : " + student.id + " " + student.tel);
        }
    }
}