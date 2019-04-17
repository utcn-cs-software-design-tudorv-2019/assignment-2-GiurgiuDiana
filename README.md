# assignment-2-GiurgiuDiana
assignment-2-GiurgiuDiana created by GitHub Classroom


Partially working. 

Bugs when it comes to the Hibernate components and html view.important part of HTML pages are done. 

Hibernate: select teacher0_.id as id1_3_, teacher0_.address as address2_3_, teacher0_.age as age3_3_, teacher0_.email as email4_3_, teacher0_.name as name5_3_, teacher0_.passsword as passswor6_3_ from teacher teacher0_
2019-04-17 10:48:02.740  WARN 6080 --- [nio-8010-exec-2] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 0, SQLState: 42P01
2019-04-17 10:48:02.741 ERROR 6080 --- [nio-8010-exec-2] o.h.engine.jdbc.spi.SqlExceptionHelper   : ERROR: relation "teacher" does not exist
  Position: 191
2019-04-17 10:48:02.756 ERROR 6080 --- [nio-8010-exec-2] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.springframework.dao.InvalidDataAccessResourceUsageException: could not extract ResultSet; SQL [n/a]; nested exception is org.hibernate.exception.SQLGrammarException: could not extract ResultSet] with root cause

org.postgresql.util.PSQLException: ERROR: relation "teacher" does not exist

Issue: can not resolve error for the past 2 day. Online not helping
