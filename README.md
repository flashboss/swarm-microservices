Microservices implementation through WildFly Swarm

To deploy it in the openshift demo online:

oc login https://api.starter-us-west-1.openshift.com
oc new-project wildflyswarm
oc new-app --name swarm-microservices redhat-openjdk18-openshift~https://github.com/flashboss/swarm-microservices
