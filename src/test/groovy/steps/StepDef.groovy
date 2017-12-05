package steps

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^the input '(\d+)\+(\d+)'$/) { int arg1, int arg2 ->

}