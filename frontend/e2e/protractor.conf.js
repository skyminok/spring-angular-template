// @ts-check
// Protractor configuration file, see link for more information
// https://github.com/angular/protractor/blob/master/lib/config.ts

const {SpecReporter} = require('jasmine-spec-reporter');

// noinspection JSClosureCompilerSyntax,JSUnusedGlobalSymbols,JSValidateTypes
/**
 * @type { import("protractor").Config }
 */
exports.config = {
//    chromeDriver: '../node_modules/protractor/node_modules/webdriver-manager/selenium/chromedriver_81.0.4044.129',

    allScriptsTimeout: 11000,
    specs: [
        './src/**/*.e2e-spec.ts'
    ],
    capabilities: {
        chromeOptions: {
            args: ["--headless", "--window-size=800,600"]
        },
        browserName: 'chrome'
    },

    directConnect: true,
    baseUrl: 'http://localhost:4200/',
    framework: 'jasmine',
    jasmineNodeOpts: {
        showColors: true,
        defaultTimeoutInterval: 30000/*,
        print: function () {
        }*/
    },
    onPrepare() {
        require('ts-node').register({
            project: require('path').join(__dirname, './tsconfig.json')
        });
        // noinspection JSCheckFunctionSignatures
        let specReporter = new SpecReporter({spec: {displayStacktrace: 'pretty'}});
        jasmine.getEnv().addReporter(specReporter);
    }
};
