# The Email Formatter

<p align="center">
  <img src="./public/images/logo-main.png" height="200" width="300" />
</p>

<div align="center">
    <img src="./public/images/play-logo.png" height="50" width="100" />
    <img src="./public/images/scala-logo.png" height="50" width="120" />
</div>

## Overview

<strong>The Email Formatter.</strong>

Receives a text and formats it according to the characters limit per line.

The project was build on Play Framework and developed using Scala programming language.

## How to run
### Please prefer to run this project in a Docker container:
#### 1. Clone this repo from gitHub
    git clone https://github.com/gustavogmail/EmailFormatter.git
#### 2. In the project root folder:
    docker build -t email-formatter:v1 .
    docker run -p 9000:9000 email-formatter:v1
#### 3. Open the Google Chrome browser on:
    http://localhost:9000

### Running locally
#### Make sure you have:
<ul>
    <li><a href="https://docs.scala-lang.org/getting-started/index.html">Scala</a> installed</li>
    <li><a href="https://www.oracle.com/java/technologies/downloads/#jdk18-windows">JDK</a> installed</li>
    <li><a href="https://www.scala-sbt.org/download.html">sbt</a> installed</li>
</ul>

#### 1. Clone this repo from gitHub
    git clone https://github.com/gustavogmail/EmailFormatter.git
#### 2. Add sbt\bin directory to your System Environment path variable

#### 3. In the project's root folder, run the application:
    sbt run
#### 4. Open the Google Chrome browser on:
    http://localhost:9000
