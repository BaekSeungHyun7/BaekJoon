백준 알고리즘 (https://www.acmicpc.net/) 문제 풀이

+ 프로그래머스 (https://programmers.co.kr/) 문제

scr/baekjoon

사용 언어 : JAVA 11+

패키지 내에 문제번호 클래스로 작성되어 있습니다.
(ex 2557번 Hello World! 문제 -> b2557.java)
(ex 프로그래머스 문제 -> prog0000.java)

일부 코드는 백준에서 작성하고 실행할 때 컴파일 오류가 날 수 있습니다.
(ex package 입력, import문, 클래스 명)
   
다음은 해당 코드를 사용할 때 몇가지 유의사항 입니다.
1. 클래스명은 Main으로 통일
2. 패키지명은 선언하지 않음
3. 입출력 선언은 가급적이면 한번에 선언 (시간 초과로 인한 오류 방지)
   

Java Algorithm Solutions
This repository contains solutions to algorithm problems written in Java (JDK 11).
The solutions are organized by problem number and platform. Below are a few guidelines and important notes for using this code.

Getting Started
Environment
Language: Java
JDK Version: 11 (Some solutions may require JDK 1.8)
File Naming
Solutions are named according to the problem number and platform:
Baekjoon Problem Example: b2557.java (for problem 2557 "Hello World!")
Samsung Academy Problem Example: swea0000.java
Programmers Problem Example: prog0000.java
Important Notes
Some codes may produce compilation errors when executed directly on platforms like Baekjoon. Follow these steps to resolve common issues:

Class Name: Ensure the class name is changed to Main before submission.
Package Declaration: Do not include any package declaration.
Input/Output Optimization:
Declare all input/output at once to avoid time limit errors.
Prefer BufferedReader over Scanner for input handling (to prevent timeout errors).
Imports: Ensure all necessary import statements are included in the code.
