# Springboot Komapper User Board

- Kotlin + Spring Boot + Coroutine

---

### Table.
- 사용자 정보: User
    - user_idx: 식별값(PK): Int
    - user_name: 이름: String
    - user_age: 나이: Int
    - user_number: 번호: Int
    - user_address: 주소: String
    - user_update: 최근변경일자: DateTime
    - user_add: 최초등록일자: DateTime
      <br><br>
- 게시판 정보: Board
    - board_idx: 식별값(PK): Int
    - user_idx: 사용자 식별값(FK): Int
    - board_title: 제목: String
    - board_contents: 내용: String
    - board_update: 최근변경일자: DateTime
    - board_add: 최초등록일자: DateTime

---

### Api.

### 회원: /user
- 추가
    - 단건추가:
- 조회
    - 전체조회:
    - 단건조회:
- 수정
    - 단건수정:
- 삭제
    - 전체삭제:
    - 단건삭제:

### 게시판: /board
- 추가
    - 게시물 단건추가:
- 조회
    - 게시물 전체조회:
    - 게시물 단건조회:
- 수정
    - 게시물 단건수정:
- 삭제
    - 게시물 전체삭제: