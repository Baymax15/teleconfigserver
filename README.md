# teleconfigserver
The config server for spring projects (here, used for teletomo project). This is a spring application built with maven, and can be run like usual.

## To generate encryption key
`%JAVA_HOME%/bin/` contains a "keytool" application for creating keystore

[Documentation for keytool](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/keytool.html)

Example:
```
keytool -genkeypair -alias apiEncKey -keyalg RSA -dname "CN=Baymax15,OU=example,O=example.org,C=IN" -keypass 7313Phon3 -keystore apiEncKey.jks -storepass 7313Phon3
```
If the tool warns to migrate to PKCS12 format, then use the below example for reference
```
keytool -importkeystore -srckeystore apiEncKey.jks -destkeystore apiEncKey.jks -deststoretype pkcs12"
```

## Required environment variables
| Envs     | Description                             | Example           |
| -------- | --------------------------------------- | ----------------- |
|`GIT_URI` | uri to the git repository               | teleconfigrepo.git|
|`KS_LOC`  | location of the keystore file generated | apiEncKey.jks     |
|`KS_PASS` | password of the keystore                | 7313Phon3         |
|`KS_ALIAS`|alias given to the keystore              | apiEncKey         |

### Optional variables
| Envs   | Description                     | Default |
|--------| --------------------------------| ------- |
| `PORT` | port on which the server is run | 8888    |

These are provided as property values in [application.properties](src\main\resources\application.properties)
