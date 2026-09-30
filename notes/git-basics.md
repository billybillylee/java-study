# Git & GitHub 기초 (1일차 학습 노트)

> Java 풀스택 과정 1일차. Git 설치부터 첫 push까지 직접 겪은 내용을 정리했습니다.

---

## 1. Git vs GitHub

| | Git | GitHub |
|---|---|---|
| 정체 | 내 컴퓨터에서 쓰는 버전 관리 도구 | Git 저장소를 올려두는 온라인 사이트 |
| 비유 | 게임의 세이브 기능 | 세이브 파일을 보관하는 클라우드 |
| 인터넷 | 없어도 됨 | 필요함 |

## 2. 핵심 용어

| 용어 | 뜻 |
|---|---|
| Repository (repo) | 프로젝트 폴더 하나 (저장소) |
| Commit | 현재 상태를 저장하는 세이브 포인트 |
| Push | 내 컴퓨터의 커밋을 GitHub에 올리기 |
| Pull | GitHub의 최신 내용을 내 컴퓨터로 가져오기 |
| Clone | GitHub 저장소를 내 컴퓨터로 통째로 복사 |

## 3. 최초 1회 설정

```bash
git --version                                   # 설치 확인
git config --global user.name "내아이디"          # 커밋 작성자 이름
git config --global user.email "가입이메일"       # GitHub 가입 이메일과 동일하게
git config --global --list                      # 설정 확인
```

## 4. 저장소 가져오기 (처음 1번)

```bash
mkdir /c/dev
cd /c/dev
git clone https://github.com/내아이디/java-study.git
cd java-study
```

## 5. 매일 쓰는 핵심 루틴

```bash
cd /c/dev/java-study          # 1) 작업 폴더로 이동 (터미널을 열 때마다)
# ... 코드 작성 후 저장(Ctrl+S) ...
git status                    # 2) 바뀐 파일 확인
git add .                     # 3) 변경사항을 상자에 담기
git commit -m "무엇을 했는지"   # 4) 세이브 포인트 만들기
git push                      # 5) GitHub에 올리기
```

택배 비유: `add`는 상자에 담기, `commit`은 포장하고 송장 붙이기, `push`는 발송.

**주의:** push는 commit된 것만 올립니다. 파일을 저장(Ctrl+S)만 하고 commit하지 않으면 GitHub에 올라가지 않습니다.

## 6. `git`을 붙이는 명령어 vs 안 붙이는 명령어

| 터미널 기본 명령어 (`git` 안 붙임) | Git 명령어 (`git` 붙임) |
|---|---|
| `cd` 폴더 이동 | `git clone` 저장소 복사 |
| `ls` 파일 목록 | `git status` 상태 확인 |
| `pwd` 현재 위치 | `git add` 변경사항 담기 |
| `mkdir` 폴더 생성 | `git commit` 세이브 포인트 |
| `rm` 파일 삭제 | `git push` GitHub에 올리기 |
| `echo` 글자 출력 | |

> 외우는 팁: `add`, `commit`, `push`, `clone`, `status` 앞에는 항상 `git`.

## 7. git status 읽는 법

| 결과 | 의미 | 다음 행동 |
|---|---|---|
| `modified` (빨간색) | 바뀌었지만 아직 안 담음 | `git add .` |
| `Changes to be committed` (초록색) | 상자에 담김 | `git commit` |
| `nothing to commit, working tree clean` | 바뀐 게 없음 | 파일 수정/저장부터 |

## 8. 오늘 만난 에러 모음

| 에러 / 증상 | 원인 | 해결 |
|---|---|---|
| `git--version` → 인식되지 않음 | `git`과 `--version` 사이 띄어쓰기 없음 | `git --version` |
| `'git' 용어가 ... 인식되지 않습니다` | 설치 직후 열어둔 터미널이라 못 찾음 | 터미널을 완전히 닫고 새로 열기 / 재부팅 / Git Bash 사용 |
| `clone: command not found` | 앞에 `git` 빠뜨림 | `git clone ...` |
| `commit: command not found` | 앞에 `git` 빠뜨림 | `git commit ...` |
| `No such file or directory` (`cd java-study`) | 폴더 위치가 다름 (Git Bash를 새로 열면 홈 `~`에서 시작) | `cd /c/dev/java-study` |
| `Is a directory` | 경로만 입력하고 `cd`를 빠뜨림 | `cd /c/dev/java-study` |
| `Author identity unknown` | 이름/이메일 미등록 | `git config --global user.name / user.email` |
| `nothing to commit, working tree clean` | 파일을 수정/저장하지 않음 | 파일 수정 후 저장(Ctrl+S) |
| `warning: LF will be replaced by CRLF` | Windows 줄바꿈 안내 (에러 아님) | 무시해도 됨 |

## 9. 터미널 메시지 종류

| 종류 | 의미 |
|---|---|
| `error` / `fatal` | 실패. 원인을 찾아 고쳐야 함 |
| `warning` | 경고. 동작은 했지만 참고하라는 안내 |
| 아무 메시지 없음 | 대부분 성공 |

## 10. 알아두면 좋은 것들

- `>>` 는 파일 끝에 **덧붙이기**, `>` 는 파일 내용을 **덮어쓰기** (실수로 `>` 쓰면 기존 내용이 사라짐)
- 터미널에서 **위 방향키(↑)** 로 이전 명령어를 불러올 수 있음
- 경로 입력 중 **Tab 키**로 자동 완성 (오타 방지)
- 명령어는 "명령어 + 띄어쓰기 + 대상" 구조. 띄어쓰기 하나로 의미가 완전히 달라짐
- 지금 어느 폴더에 있는지 프롬프트를 항상 확인 (`pwd` 로도 확인 가능)
- README 같은 문서 파일은 메모장 대신 VS Code/IDE로 편집하는 게 인코딩 문제가 적음
- 코드 저장소는 `C:\Program Files` 안에 두지 말고, 영문 경로(`C:\dev`)에 두기
- 대화(프롬프트) 내용은 Git과 무관. 배운 내용은 직접 파일로 정리해서 commit해야 저장됨

## 11. Java 개발 환경 (다음 단계 메모)

- IDE: Eclipse
- JDK: 수업 안내 버전을 따름. 안내가 없으면 LTS 버전인 17 (또는 21)
- 설치 순서: JDK → `java -version`, `javac -version` 확인 → Eclipse → workspace 지정 → Hello World
- JDK 설치 시 `JAVA_HOME` 설정과 `PATH` 추가 옵션을 켜두기

---

## 오늘의 한 줄 회고

에러 메시지는 실패가 아니라 힌트다. 메시지에 찍힌 내가 입력한 그대로의 글자를 읽으면 원인이 보인다.
