Microservices implementation through WildFly Swarm

To deploy it in the openshift demo online:

- download oc on https://gcsweb-ci.svc.ci.openshift.org/gcs/origin-ci-test/branch-logs/origin/v3.7.0/builds/test_branch_origin_cross/1032/artifacts/zips/

- oc login https://api.starter-us-west-1.openshift.com
- oc new-project wildflyswarm
- oc new-app --name swarm-microservices redhat-openjdk18-openshift~https://github.com/flashboss/swarm-microservices:javaee

- connect to http://swarm-microservices-wildflyswarm.a3c1.starter-us-west-1.openshiftapps.com/hello to view the response
