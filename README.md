# uninews_admin

uninews_admin 是一个使用 Spring Boot 构建的爬虫管理系统。该系统管理由 Python 编写的爬虫逻辑，并通过 RESTful API 接口管理爬虫任务的状态。

![](https://img.shields.io/badge/Language-Java-red.svg)
![](https://img.shields.io/badge/ORM-MyBatis-blue.svg)
![](https://img.shields.io/badge/Cache-Redis-yellow.svg)
![](https://img.shields.io/badge/Frame-SpringBoot-green.svg)


## 目录

- [特性](#特性)
- [技术栈](#技术栈)
- [前提条件](#前提条件)
- [安装与配置](#安装与配置)
- [项目结构](#项目结构)
- [运行项目](#运行项目)
- [测试](#测试)
- [贡献](#贡献)
- [许可证](#许可证)

## 特性

- 启动和停止爬虫任务
- 查询爬虫任务的状态
- 使用 MySQL 数据库存储爬虫任务信息

## 技术栈

- Java 17
- Spring Boot 2.5.x
- MySQL
- Python
- Maven

## 前提条件

在开始之前，请确保您的本地环境中安装了以下软件：

- [Java 17 或 更高版本](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) 
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/mysql/)
- [Python 3](https://www.python.org/downloads/)

## 安装与配置

### 克隆项目

首先，克隆项目仓库到本地：

```bash
git clone https://github.com/your-username/uninews_admin.git
cd uninews_admin
```

## 配置数据库

确保您已经安装并启动了 MySQL。创建一个新的数据库：
```bash
CREATE DATABASE uninews_admin;
```

## 运行项目

### 使用 Maven 构建并运行
```bash
./mvnw clean install
./mvnw spring-boot:run
```
项目将在 `http://localhost:8080` 上启动。

## 测试

运行单元测试 `./mvnw test`

## 许可证
此项目遵循 `MIT` 许可证。详情请参阅 `LICENSE` 文件。



