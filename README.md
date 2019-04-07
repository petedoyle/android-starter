Android Starter
===============

A base repo for starting a new best-practices Android app, fast. 

Minimally opinionated, **it provides**:

- The base Android config as generated by Android Studio (3.5 Canary 10)
- Build scripts that:
    - Use the Gradle [Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html)
    - Use [`buildSrc`](https://handstandsam.com/2018/02/11/kotlin-buildsrc-for-better-gradle-dependency-management/) for dependency management and easier multi-module development
    - Enable experimental extensions so you can use [Parcelize](https://kotlinlang.org/docs/tutorials/android-plugin.html) on data classes
- Dagger 2 pre-configured, with *just* enough code to help understand the Kotlin syntax
- A package structure that starts you on your way to packaging by feature (makes it easier to later move into Gradle modules to improve build speeds)
- A code formatter based on the official [Kotlin coding conventions](https://kotlinlang.org/docs/reference/coding-conventions.html), with tweaks:
     - 120 character line limit
     - 4 space continuation indent (instead of 8)
     - Support for `@formatter:on` and `@formatter:off` tags
- 100% Kotlin

It **does not provide**:

- Any specific architecture. Use MVVM, MVP, MVI, or roll your own.
- Any specific persistence. Use Room, SQLDelight, etc.

#### Coming soon
- Enable incremental annotation processing for faster builds (waiting for a few more annotation processors to [support](https://github.com/gradle/gradle/blob/master/subprojects/docs/src/docs/userguide/java_plugin.adoc#state-of-support-in-popular-annotation-processors) it)
- Automatic `versionCode` management for CI builds
- Sample CircleCI config that:
    - Runs espresso tests on an emulator
    - Manual approval step to automatically the development branch to `master`
    - Manual approval step to push the newest build from `master` to Google Play
    - (as samples to start from)

#### Investigating
- Fastlane support

## Starting a new project
- Clone this repo: 
    - `git clone https://github.com/petedoyle/android-starter.git`

- Run these commands:

```
# Remember the version you cloned
$ AS_VERSION="$(git rev-parse --abbrev-ref HEAD)@$(git rev-parse --short HEAD)"

# Delete the existing git repo, leaving the contents
$ rm -rf .git

# Init a new repo
$ git init

# Commit your project
$ git add . && git commit -m "Create new project from petedoyle/android-starter ($AS_VERSION)"
```

Then, push your repo to Github, etc.

# License

    Copyright 2019 Pete Doyle

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.