---
# 제목 1단계
## 제목 2단계
### 제목 3단계
#### 제목 4단계
##### 제목 5단계
###### 제목 6단계 
---
`code`
<code>This is sentence.</code>
```python
py_vector = one_hot_encoding("파이",word2index)
py_vector.dot(torch_vector)
>>> 0.0
```
---
1. 첫번째
1. 두번째
1. 세번째

+ 순서없음
    - 홍길동
        * 중대장
            + 프로실망러
---
__볼드(진하게)__  
_이탤릭체(기울여서)_    
~~취소선~~  
<u>밑줄</u>  
__볼드로 진하게 만들다가*이탤릭으로 기울이고*다시 볼드로__
---
> A
>> B
>>> C
---
유형1(`설명어`를 클릭하면 URL로 이동) : [TheoryDB 블로그](https://theorydb.github.io "마우스를 올려놓으면 말풍선이 나옵니다.")  
유형2(URL 보여주고 `자동연결`) : <https://theorydb.github.io>  
유형3(동일 파일 내 `문단 이동`) : [동일파일 내 문단 이동](#markdown의-반드시-알아야-하는-문법)  

유형3 문단 매칭방법 : 제목(header)를 복사 붙여넣기 후,
1) 특수문자제거
2) 스페이스를 갯수만큼 -로 변경
3) 대문자->소문자로 변경
   예) “#Markdown! 장점” -> “#markdown–장점”
---
표 그리기

|                  | 수학                        | 평가              |  
|:--- | ---: | :---: |  
| 철수             | 90            | 참잘했어요. |  
| 영희           | 50            | 분발하세요. |

- 라인 단위로 생각하면서 구분자(|)로 열을 구분해주면 위와 같이 대충 그려도 알아서 예쁘게 완성된다.
- 헤더(머리글)를 분리하고 싶은 경우, 위 예제와 같이 2번째 라인에 ---을 사용하면 된다.
- 정렬이 필요한 경우, 콜론(:) 기호를 구분선(---) 왼쪽, 오른쪽, 양쪽에 배치한다.
---
유형1(`이미지` 삽입) :  
![이미지](https://theorydb.github.io/assets/img/think/2019-06-25-think-future-ai-1.png "인공지능")

유형2(`사이즈를 조절`하고 싶은 경우 HTML 태그로 처리) :   
<img src="https://theorydb.github.io/assets/img/think/2019-06-25-think-future-ai-1.png" width="300" height="200">

유형3(이미지 삽입 후, `링크 걸기`)
[![이미지](https://theorydb.github.io/assets/img/think/2019-06-25-think-future-ai-1.png)](https://theorydb.github.io/think/2019/06/25/think-future-ai/)
---
