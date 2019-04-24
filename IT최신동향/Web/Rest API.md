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
    
REST(1998)

    로이필딩 : 기존 Http Object Model 을 다듬어 논문으로 발표
    +XML API (SOAP) 이 처음 만들어짐.
    
REST(2008)
    
    분산 하이퍼미디어 시스템을 위한 아키텍쳐 스타일
        1.client-server 구조
        2.stateless 구조
        3.cache기반
        4.uniform Interface
            -주소로 식별
            -html 메시지에 조작명령어를 보내야함.
            -메시지는 스스로를 설명해야한다. 
            

    GET / HTTP/1.1  // 목적지가 없다. (스스로를 증명 불가)

    GET / HTTP/1.1/Host:www.example.org //(스스로를 증명 가능한 REST 요청)


참고 링크 : 네이버 D2에서 REST API 강연.
https://www.youtube.com/watch?v=RP_f5dMoHFc
