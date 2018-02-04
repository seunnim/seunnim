<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>개발환경 세팅!!</title>
</head>
<body>
<h3>
1. 개발환경 세팅!!
</h3>
<P>&nbsp;1) Project 다운로드 </P>
&nbsp;&nbsp;- 구글드라이브에서 Project.zip 다운로드하여 C드라이브에 압축풀기(C:/project)&nbsp;&nbsp;
<a target="#" href="https://drive.google.com/drive/folders/1b2OjUtDr_3HBNel3NBbG1nmlH2kj3km7?usp=sharing">구글드라이브 이동</a><br>
&nbsp;&nbsp;- project폴더의 eclipse를 실행하면 됨.&nbsp;(구글드라이브에 tools폴더에 개발에 필요한 tool을 올려두었음)<br>
<br>

<P>&nbsp;2) SSH와 FTP접속을 위한 세팅 </P>
&nbsp;&nbsp;- 서버에 접속하기 위해 putty와 FileZilla를 다운받고, seunRedhatLinux.ppk 파일을 받는다.<br>
&nbsp;&nbsp;- putty를 설치하고, puttygen을 통해 ppk파일 생성(만들어둔 seunRedhatLinux.ppk 사용하면 됨)<br>
&nbsp;&nbsp;- putty를 실행하여 Host Name : ec2-user@13.125.68.235, Port:22, Connection Type : SSH 선택<br>
&nbsp;&nbsp;- 좌측 메뉴의 Connection – SSH – Auth 메뉴로 이동, 우측 Browse 버튼을 선택해서 다운받아둔 ppk 파일 선택<br>
&nbsp;&nbsp;- open버튼을 클릭하면 처음엔 신뢰할 수 있는지 확인하는 알림 대화상자가 표시되는데 "Yes"누르면 됨.(입력한 정보 Save도 가능함)<br>
&nbsp;&nbsp;&nbsp;&nbsp;(관련 블로그 : <a target="#" href="http://devstory.ibksplatform.com/2017/08/aws-windows-linux-putty.html">http://devstory.ibksplatform.com/2017/08/aws-windows-linux-putty.html</a> )
<br>
&nbsp;&nbsp;- AWS에 SFTP전송을 위해 FileZilla 설치 후 실행<br>
&nbsp;&nbsp;- Private Key 셋팅을 위해 편집 -> 설정 으로 들어가 좌측에서 연결->FTP->SFTP선택한 뒤 "키 파일 추가" 버튼 클릭하여 putty에서 추가한 ppk파일을 선택 <br>
&nbsp;&nbsp;- 사이트 관리자 싱행하여 새사이트 버튼을 클릭하여 호스트에 AWS의 public ip(13.125.68.235) 입력<br>
&nbsp;&nbsp;- 프로토콜 : SFTP선택, 로그온유형 : 일반, 사용자 : ec2-user, 비밀번호 : 공란으로 입력하고 연결하면 됨<br>
<br>

<P>&nbsp;3) MariaDB 접속을 위한 세팅 </P>
&nbsp;&nbsp;- 구글드라이브 tools에서 mariaDB 설치파일을 다운로드함(마리아DB설치하면 사용툴이 같이 설치됨), 또는 Toad와 같은 Freeware설치 해도 됨<br>
&nbsp;&nbsp;&nbsp;&nbsp;(관련 블로그 : <a target="#" href="http://pyonji.tistory.com/11">http://pyonji.tistory.com/11</a>)<br>
&nbsp;&nbsp;- HeidiSQL을 실행하여 세션관리차 실행하여 아래 정보로 신규 생성해 줌 <br>
&nbsp;&nbsp;- 네트워크유형 : MySQL(TCP/IP), 호스트명 : seunnim-mariadb.cobd27r5zim4.ap-northeast-2.rds.amazonaws.com<br>
&nbsp;&nbsp;- 사용자 : user, 암호 : user!234<br>
&nbsp;&nbsp;- 포트 : 3306, 데이터베이트 : seundb

</body>
</html>
