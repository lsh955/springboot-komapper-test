# Springboot Komapper User Board

- Kotlin + Spring Boot + Coroutine

---

### Table.
- 사용자 정보: member
    - member_idx: 식별값(PK): Int
    - member_name: 이름: String
    - member_age: 나이: Int
    - member_number: 번호: Int
    - member_address: 주소: String
    - member_update: 최근변경일자: DateTime
    - member_add: 최초등록일자: DateTime
      <br><br>
- 게시판 정보: board
    - board_idx: 식별값(PK): Int
    - user_idx: 사용자 식별값(FK): Int
    - board_title: 제목: String
    - board_contents: 내용: String
    - board_update: 최근변경일자: DateTime
    - board_add: 최초등록일자: DateTime

---

### Api.

### 회원: /member
- 추가
    - 단건추가: POST /member/save
- 조회
    - 부분조회: GET /list?offset=0&limit=20
- 수정
    - 단건수정: PUT /member/update
- 삭제
    - 단건삭제: DELETE /member/delete

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