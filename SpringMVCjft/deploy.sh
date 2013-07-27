sh /home/prashant/apps/apache-tomcat-7.0.35/bin/shutdown.sh
rm -rf /home/prashant/apps/apache-tomcat-7.0.35/webapps/SpringMVCjft.war
rm -rf /home/prashant/apps/apache-tomcat-7.0.35/webapps/SpringMVCjft
mv /home/prashant/IdeaProjects/SpringMaven/SpringMVCjft/target/SpringMVCjft.war /home/prashant/apps/apache-tomcat-7.0.35/webapps/
sh /home/prashant/apps/apache-tomcat-7.0.35/bin/startup.sh
