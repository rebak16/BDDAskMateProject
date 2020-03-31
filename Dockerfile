# Dockerfile
FROM openjdk:11
COPY . /Codecool/Codecool Rooms/Test Automation/Jobhunt/JobHuntPractice/src/test/java/
WORKDIR /Codecool/Codecool Rooms/Test Automation/Jobhunt/JobHuntPractice/src/test/java
RUN javac com.qa.stepDefinitions.AnswerTest.java
CMD ["java", "com.qa.stepDefinitions.AnswerTest"]