// @ts-check
import js from '@eslint/js';
import plugin from '@typescript-eslint/eslint-plugin';
import parser from '@typescript-eslint/parser';
import templateParser from '@angular-eslint/template-parser';
import templatePlugin from '@angular-eslint/eslint-plugin-template';
import angularEslint from '@angular-eslint/eslint-plugin';

export default [
    {
        ignores: ['projects/**/*', 'src/index.html', 'build/**/*', 'node_modules/**/*']
    },
    js.configs.recommended,
    {
        files: ['src/**/*.ts'],
        languageOptions: {
            parser: parser,
            globals: {
                console: 'readonly',
                window: 'readonly',
                document: 'readonly',
                navigator: 'readonly',
                setTimeout: 'readonly',
                setInterval: 'readonly',
                clearTimeout: 'readonly',
                clearInterval: 'readonly',
            }
        },
        plugins: {
            '@typescript-eslint': plugin,
            '@angular-eslint': angularEslint,
        },
        rules: {
            '@typescript-eslint/no-explicit-any': 'warn',
            '@typescript-eslint/explicit-function-return-type': 'off',
            '@typescript-eslint/explicit-module-boundary-types': 'off',
            '@angular-eslint/directive-selector': [
                'error',
                {
                    type: 'attribute',
                    prefix: 'app',
                    style: 'camelCase'
                }
            ],
            '@angular-eslint/component-selector': [
                'error',
                {
                    type: 'element',
                    prefix: 'app',
                    style: 'kebab-case'
                }
            ]
        }
    },
    {
        files: ['src/**/*.spec.ts'],
        languageOptions: {
            globals: {
                describe: 'readonly',
                beforeEach: 'readonly',
                it: 'readonly',
                expect: 'readonly',
                beforeEach: 'readonly',
                HTMLElement: 'readonly',
            }
        },
        rules: {}
    },
    {
        files: ['src/**/*.html'],
        languageOptions: {
            parser: templateParser
        },
        plugins: {
            '@angular-eslint-template': templatePlugin,
        },
        rules: {
            '@angular-eslint-template/banana-in-box': 'error',
            '@angular-eslint-template/no-negated-async': 'error'
        }
    }
];
