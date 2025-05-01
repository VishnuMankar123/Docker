# Use Ubuntu 16.04 as the base image
FROM ubuntu:16.04

# Update the package list to ensure we get the latest packages
RUN apt-get update -y

# Install Apache2 web server
RUN apt-get install -y apache2

# Change ownership of the web directory to Apache's default user
RUN chown -R www-data:www-data /var/www/

# Set environment variables used by Apache
ENV APACHE_RUN_USER www-data               # Apache will run as user 'www-data'
ENV APACHE_RUN_GROUP www-data             # Apache will run as group 'www-data'
ENV APACHE_LOG_DIR /var/log/apache2       # Log directory
ENV APACHE_LOCK_DIR /var/lock/apache2     # Lock directory
ENV APACHE_PID_FILE /var/run/apache2.pid  # PID file path

# Copy a local index.html file into the Apache web root
ADD index.html /var/www/html/

# Expose port 80 so web traffic can reach the container
EXPOSE 80

# Set the main command to run Apache in the foreground so the container stays alive
ENTRYPOINT ["/usr/sbin/apache2ctl"]
CMD ["-D","FOREGROUND"]
