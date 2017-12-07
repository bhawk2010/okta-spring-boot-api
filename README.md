
## Table of Contents

- [Overview](#overview)
- [Install, configure and run](#install-configure-and-run)
- [Next steps](#next-steps)
- [References](#references)

## Overview

This application is a reference implementation of Spring Boot REST Api secured by OAuth2. Soring boot app is secured using Spring Security OAuth2 (via ResourceServer annotations) and Okta developer libraries (okta-spring-boot-starter). 

Access to REST API methods (resource mappings) can be managed on global or individual method level with annotations or expression language. 

This API receives access token bearer, then access JWT Token is validated and mapped to Spring Security objects. 

## Install, configure and run

Get copy from github repo. Configure client id, audience and authorization server url in application.yml file.

```
okta:
  oauth2:
    # Okta configuration
    clientId: <your-app-client-id>
    issuer: https://your-org.oktapreview.com/oauth2/your-auth-server-id
    audience: https://your-app.your-org.com
```

Run spring boot app:

`mvn spring-boot:run`

## Next steps

Verify the application authorization part:
* Authorization in Resource API
* Using scopes and claims from the token
* Permissions and roles mapping
* Expression based access control where needed

## References

Using okta developer resources from git: okta and oktadeveloper accounts.

Examples from okta-spring-security:
https://github.com/okta/okta-spring-boot


