package p3;

public class App {
    public static void main(String[] args) {
        
        AAA a = new AAA();
        a.method1();
        a.method1();
        
    }
}


class AAA {  
    private BBB b ;
    
    // DI: Dependency Injection
    // DI... 생성자 주입
    public AAA(BBB b){
        this.b = b;
    }
    // DI... 세터 주입
    public void setBBB(BBB b){
        this.b = b;
    }

    public void method1(){ 
         
        b.bbbMethod();
    }
}

class BBB {
    public void bbbMethod(){

    }
}

/// AAA 클래스에서서 BBB클래스가 한번도 호출된적없으면 >> UML기준으로 선을 안그림
/// 하나라도 생성되는 순간 선(Association)그려려야함
/// Association은 관계도 빠르게 그릴떄 씀 이유) AAA BBB중 한곳에서라 서로의 클래스에 대해 호출한 코드가 있으면 생기기
/// 때문에 방향이 없어서 알기어려움
/// Directed Association은 방향이 중요 // B가 A를 사용하면 , b->A 로 선 표기가됨
/// class BBB{ AAA a;}
/// aggregation : 집합 , composition : 구성
/// 
/// depedency : 

// class AAA {    >> AAA 가  BBB 보다 크고 BBB가 먼저 사라질때 의존관계 A - -  - > B
//     //    BBB b = new BBB(); 
    
//         public void method1(){
//             BBB b = new BBB(); 
//             b.bbbMethod();
//         }
//     }
    


// public class App { // 의존 주입일때의 main >> 의존하는 클래스의 인스턴스를 생성하지 않고 메서드로만 사용용
//     public static void main(String[] args) {
  
//         AAA a = new AAA();
//         BBB b = new BBB();
//         a.method1(b);
//         a.method1(b);
        
//     }
// }
// class AAA {   의존주입  dependency injection : 파라미터를 주입받는다 해서 그럼
                // BBB의 메모리의 생성소멸이 AAA와 상관이 없는 상황

    
//         public void method1(BBB b){ 
             
//             b.bbbMethod();
//         }
//     }
    
//     class BBB {
//         public void bbbMethod(){
    
//         }
//     }



// <의존성>

// package p3;

// public class App {
//     public static void main(String[] args) {
  
//         AAA a = new AAA();
//         a.method1();
//         a.method1();
        
//     }
// }


// class AAA {  
//     private BBB b = new BBB(); // >> AAA의 필드에 BBB가 들어있다는건 굉장히 의존관계가 높아야함
//                                 // **** 필드에 있는건 강력한 의존관계계

//     public void method1(){ 
         
//         b.bbbMethod();
//     }
// }

// class BBB {
//     public void bbbMethod(){

//     }
// }



// package p3;

// public class App {
//     public static void main(String[] args) {
  
//         AAA a = new AAA();
//         a.method1();
//         a.method1();
        
//     }
// }


// class AAA {  
//     private BBB b = new BBB();  // *** AAA와 BBB는 라이프 사이클을 공유하는 관계 !!!! (has - a 관계 : 소유 관계) // 포함관계
//     // composition A<|>--b 
//     // >> AAA의 필드에 BBB가 들어있다는건 굉장히 의존관계가 높아야함
//                                 // **** 필드에 있는건 강력한 의존관계

//     public void method1(){ 
         
//         b.bbbMethod();
//     }
// }

// class BBB {
//     public void bbbMethod(){

//     }
// }

/// 
// class SomeClass { // Java 기준 위험한 문법 >> 사용은 가능하지만 
// public int a;
// public int b;
// }

// class commands {  // 상수로 쓰는 경우외엔 거의 안함 >> 어떤 한 학생의 질문문
// public static final String ADD_STUDENT = "1";
// public static final String SHOW_STUDENTS = "2";
// }
