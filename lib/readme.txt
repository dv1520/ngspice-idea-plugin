IntelliJ IDEA Community Edition IC-173.SNAPSHOT has own
slf4j-api-1.7.10.jar
which conflicts with the zt-exec dependency
slf4j-api-1.7.2.jar

We need to delete slf4j-api-1.7.2.jar, but it will be restored on the plugin run.
So there is empty file instead of this jar: existing jar will not be replaced, but no new class will be loaded.