REST API

  Represetational
  State
  Transfer
  Applcation
  Programming
  Interface


WEB 의 시작 (1991)

    팀 버너스리 : 정보들을 하이퍼 텍스트로 작성 연결하자!
    표현방식 :HTML
    식별자 :URL
    전송방법 : HTTP

HTTP/1.0 (1994-1996)

    로이필딩 : 기존의 프로토콜을 호환하면서 개선 할수 있을까?
    해결책 : Http Object Model
    
    REST의 개념이 만들어지게 된 계기가 됨 -> 어떻게 http 프로토콜을 건드리지 않고 웹을 개선할 수 있을까?
    차후 해결책 으로 : 독립적 진화 (uniform interface) 구조의 REST 형식으로 발전
    
EXAMPLE   
   
     메시지 하나가 자신을 대변함으로써 http를 건드리지 않는다.
     웹 1.0 -> 2.0으로 변경될 때 (프로토콜 명세가 변경될 떄) 웹 브라우저의 업데이트가 필요하지 않다.
     http 프로토콜이 변경되는 것이 아닌 요청 메시지가 변경됨.
     
 <div>
  <img width="300" src = "https://user-images.githubusercontent.com/28384064/56638352-dd9b6b80-66a8-11e9-8d6b-5b1a6ad60590.png">
 </div>
 
    위와 같이 프로토콜 또는 환경 변경에 따라 화면이 꺠질수는 있으나, Uniform interface에 따라 안돌아가진 않음  (REST의 방향성 : 호환은 되게 하자 )
    
   
    
REST(1998)

    로이필딩 : 기존 Http Object Model 을 다듬어 논문으로 발표
    +XML API (SOAP) 이 처음 만들어짐.
    
REST(2008)

    SOAP을 정리 새롭게 REST를 발표.
    
    
    
    분산 하이퍼미디어 시스템을 위한 아키텍쳐 스타일.
        1.client-server 구조
        2.stateless 구조
        3.cache기반
        4.uniform Interface
            -주소로 식별
            -html 메시지에 조작명령어를 보내야함.
            -메시지는 스스로를 설명해야한다. 

    GET / HTTP/1.1  // 목적지가 없다. (스스로를 증명 불가 x)

    GET / HTTP/1.1/Host:www.example.org //(스스로를 증명 가능한 REST 요청 o)
            -hateoas 해야한다.
    
    링크를 통해서 다음상태로 전이가능할때 hateoas.
    
    
    
VS app

    모바일 앱은 변경에 따라 업데이트를 해줘야됨. (모바일 게임 업데이트 하듯이)

    하지만 웹은 업데이트 같은거 없음. -> interoperability : http 프로토콜 자체도 호환성 매우 집착
    (ex: 1991년 네이밍 실수했던 변수들 호환성 무너질까봐 못고치고있음 )
 
결론

    REST는 독립적 발전에 대해서 고민, 
    Http 프로토콜 역시 호환성에 대해서 고민, 
    결국 웹은 독립적/호환성을 갖추어가며 진화중

    REST API 는 통신에서 사용되는 커뮤니케이션 방식으로 (기계 - 기계 ) 이해 할 수있는 명세.
    GET / HTTP / ..
    POST / HTTP / .. etc
    

          
            


참고 링크 : 네이버 D2에서 REST API 강연.
https://www.youtube.com/watch?v=RP_f5dMoHFc
