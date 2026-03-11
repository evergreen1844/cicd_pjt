# Kubernetes CI/CD Pipeline on Naver Cloud NKS

This project demonstrates a CI/CD pipeline for Kubernetes running on **Naver Cloud NKS**.  
It automates the process from source code commit to container build and deployment using a GitOps workflow.

## Architecture

Developer → Git Repository  
↓  
GitLab CI Pipeline  
↓  
Kaniko (Image Build)  
↓  
Harbor (Container Registry)  
↓  
ArgoCD (GitOps Deployment)  
↓  
Naver Cloud NKS (Kubernetes)

## Tech Stack

- Kubernetes (Naver Cloud NKS)
- GitLab CI
- Kaniko
- Harbor
- ArgoCD
- Kustomize
- Docker

## CI/CD Workflow

1. Developer pushes code to Git repository
2. GitLab CI pipeline runs
3. Kaniko builds container image
4. Image is pushed to Harbor
5. ArgoCD detects changes
6. Application is deployed to NKS

## Repository Structure

```
.
├── app        # application or static files
├── kustomize  # kustomize configuration
├── manifest   # Kubernetes manifests
└── .gitlab-ci.yml  # CI pipeline
```

## Purpose

Personal DevOps project to practice building a **cloud-native CI/CD pipeline** for Kubernetes using GitOps principles.

## Author

https://github.com/evergreen1844
