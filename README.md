# Naver Cloud NKS 기반 Kubernetes CI/CD 파이프라인

네이버 클라우드 **NKS(Naver Kubernetes Service)** 환경에서  
GitLab CI, Kaniko, Harbor, ArgoCD를 활용하여 Kubernetes 기반 CI/CD 파이프라인을 구성한 개인 DevOps 프로젝트입니다.

애플리케이션 코드 변경부터 컨테이너 이미지 빌드, 레지스트리 업로드, Kubernetes 배포까지의 과정을 자동화하는 것을 목표로 합니다.

---

## 아키텍처

Developer  
↓  
Git Repository  
↓  
GitLab CI Pipeline  
↓  
Kaniko (Container Image Build)  
↓  
Harbor (Container Registry)  
↓  
ArgoCD (GitOps Deployment)  
↓  
Naver Cloud NKS (Kubernetes Cluster)

---

## 사용 기술

- Kubernetes (Naver Cloud NKS)
- GitLab CI
- Kaniko
- Harbor
- ArgoCD
- Kustomize
- Docker

---

## CI/CD 동작 흐름

1. 개발자가 Git 저장소에 코드를 Push
2. GitLab CI 파이프라인 실행
3. Kaniko를 이용하여 컨테이너 이미지 빌드
4. 빌드된 이미지를 Harbor Registry에 Push
5. ArgoCD가 변경 사항을 감지
6. Kubernetes(NKS)에 애플리케이션 자동 배포

---

## 저장소 구조

```
.
├── app        # 애플리케이션 또는 테스트용 정적 파일
├── kustomize  # Kubernetes 배포를 위한 Kustomize 설정
├── manifest   # Kubernetes 리소스 매니페스트
└── .gitlab-ci.yml  # GitLab CI/CD 파이프라인 설정
```

---

## 프로젝트 목적

이 프로젝트는 Kubernetes 환경에서 동작하는 **클라우드 네이티브 CI/CD 파이프라인을 직접 구축해보기 위한 개인 DevOps 프로젝트**입니다.

컨테이너 기반 애플리케이션 배포 자동화와 GitOps 방식의 운영 흐름을 이해하는 것을 목표로 진행했습니다.

---

## Author

GitHub  
https://github.com/evergreen1844
