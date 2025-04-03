package p1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws Exception {
        // 주석 (annotaition)

        // 리플렉션 - 굉장히 특수 목적
        Method test1 = SomeClass.class.getMethod("test1");

        test1.getAnnotation(Writer.class);

        Writer qqq = test1.getAnnotation(null);

        System.out.println(qqq.value());
        System.out.println(qqq.date());
        System.out.println(qqq.description());

    }
}

// 이 클래스는 어떤일을 하고... 블라블라.. 언제 작성되었고 ... 블라블라..
class SomeClass {
    // 작성자: 누구누구 , 작성일 : 언제언제 . 기능명세 : 어떠어떠한 기능을 한다
    public void test1() {

    }

    // 작성자: 누구누구 , 작성일 : 언제언제 . 기능명세 : 어떠어떠한 기능을 한다
    // 일반 주석은 컴파일러가 안읽음
    // @는 컴파일러가 새겨버림
    @Writer(value = "누구누구", date = "250403", description = "이런저러한 일을한다")
    public void test2() {

    }

}

class AAA extends SomeClass {

    // 아래꺼는 오버라이딩 되었어
    @Override
    public void test1() {

    }

    public void test3() {

    }
}

// @ = annotation
// @ 사용하는건 annotation 선언
@Retention(RetentionPolicy.RUNTIME) // RUNTIME 대신 SOURCE 사용하면 가볍게 사용가능
@Target({ ElementType.FIELD, ElementType.METHOD })
@interface Writer {
    String value();

    String date() default "2025-04-03";

    String description() default "내용없음";
}