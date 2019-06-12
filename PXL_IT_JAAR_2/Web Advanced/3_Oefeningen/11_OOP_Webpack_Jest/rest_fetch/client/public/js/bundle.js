/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = "./src/js/app.js");
/******/ })
/************************************************************************/
/******/ ({

/***/ "./src/js/app.js":
/*!***********************!*\
  !*** ./src/js/app.js ***!
  \***********************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\n\nvar _PersonController = __webpack_require__(/*! ./controller/PersonController */ \"./src/js/controller/PersonController.js\");\n\nvar _PersonController2 = _interopRequireDefault(_PersonController);\n\nvar _PersonModel = __webpack_require__(/*! ./model/PersonModel */ \"./src/js/model/PersonModel.js\");\n\nvar _PersonModel2 = _interopRequireDefault(_PersonModel);\n\nvar _PersonView = __webpack_require__(/*! ./view/PersonView */ \"./src/js/view/PersonView.js\");\n\nvar _PersonView2 = _interopRequireDefault(_PersonView);\n\nvar _PersonsView = __webpack_require__(/*! ./view/PersonsView */ \"./src/js/view/PersonsView.js\");\n\nvar _PersonsView2 = _interopRequireDefault(_PersonsView);\n\nvar _ErrorView = __webpack_require__(/*! ./view/ErrorView */ \"./src/js/view/ErrorView.js\");\n\nvar _ErrorView2 = _interopRequireDefault(_ErrorView);\n\nfunction _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }\n\nvar url = 'http://192.168.33.22/api/persons/';\n\nvar personView = void 0;\nvar personsView = void 0;\nvar errorView = void 0;\nvar personModel = void 0;\nvar personController = void 0;\n\nwindow.addEventListener(\"load\", handleWindowLoad);\n\nfunction handleWindowLoad() {\n    var btnGETPersons = document.getElementById(\"btngetpersons\");\n    btnGETPersons.addEventListener(\"click\", handleClickGetAllPersons);\n    var btnPUTPerson = document.getElementById(\"btnputidname\");\n    btnPUTPerson.addEventListener(\"click\", handleClickPUTPerson);\n    personView = new _PersonView2.default();\n    personsView = new _PersonsView2.default();\n    errorView = new _ErrorView2.default();\n    personModel = new _PersonModel2.default(url);\n    personController = new _PersonController2.default(personModel, personView, personsView, errorView);\n}\n\nfunction handleClickGetAllPersons() {\n    personController.findPersons();\n}\n\nfunction handleClickPUTPerson() {\n    var id = document.getElementById(\"txtid\").value;\n    var name = document.getElementById(\"txtname\").value;\n    personController.addPersonByIdAndName(id, name);\n}\n\n//# sourceURL=webpack:///./src/js/app.js?");

/***/ }),

/***/ "./src/js/controller/PersonController.js":
/*!***********************************************!*\
  !*** ./src/js/controller/PersonController.js ***!
  \***********************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\n\nObject.defineProperty(exports, \"__esModule\", {\n    value: true\n});\n\nvar _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if (\"value\" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();\n\nfunction _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError(\"Cannot call a class as a function\"); } }\n\nvar PersonController = function () {\n    function PersonController(personModel, personView, personsView, errorView) {\n        _classCallCheck(this, PersonController);\n\n        this.personModel = personModel;\n        this.personView = personView;\n        this.personsView = personsView;\n        this.errorView = errorView;\n    }\n\n    _createClass(PersonController, [{\n        key: \"findPersons\",\n        value: function findPersons() {\n            var _this = this;\n\n            var promise = this.personModel.findPersons();\n            promise.then(function (persons) {\n                var data = { persons: persons };\n                _this.personsView.show(data);\n            }).catch(function (error) {\n                var data = { error: error };\n                _this.errorView.show(data);\n            });\n        }\n    }, {\n        key: \"addPersonByIdAndName\",\n        value: function addPersonByIdAndName(id, name) {\n            var _this2 = this;\n\n            var promise = this.personModel.addPersonByIdAndName(id, name);\n            promise.then(function (person) {\n                var data = { person: person };\n                _this2.personView.show(data);\n            }).catch(function (error) {\n                var data = { error: error };\n                _this2.errorView.show(data);\n            });\n        }\n    }]);\n\n    return PersonController;\n}();\n\nexports.default = PersonController;\n\n//# sourceURL=webpack:///./src/js/controller/PersonController.js?");

/***/ }),

/***/ "./src/js/model/PersonModel.js":
/*!*************************************!*\
  !*** ./src/js/model/PersonModel.js ***!
  \*************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\n\nObject.defineProperty(exports, \"__esModule\", {\n    value: true\n});\n\nvar _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if (\"value\" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();\n\nfunction _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError(\"Cannot call a class as a function\"); } }\n\nvar PersonModel = function () {\n    function PersonModel(url) {\n        _classCallCheck(this, PersonModel);\n\n        this.url = url;\n    }\n\n    _createClass(PersonModel, [{\n        key: \"findPersons\",\n        value: function findPersons() {\n            var _this = this;\n\n            return new Promise(function (resolve, reject) {\n                fetch(_this.url, { method: \"GET\" }).then(function (response) {\n                    if (!response.ok) {\n                        reject(\"rejected:\" + response.status);\n                        return;\n                    }\n                    resolve(response.json());\n                });\n            });\n        }\n    }, {\n        key: \"addPersonByIdAndName\",\n        value: function addPersonByIdAndName(id, name) {\n            var _this2 = this;\n\n            return new Promise(function (resolve, reject) {\n                if (!(typeof id == 'string' && /^[0-9]+$/.test(id) && parseInt(id) > 0)) {\n                    reject(\"id moet een string zijn met een getal > 0\");\n                    return;\n                }\n\n                if (!(typeof name == 'string' && name.length >= 2)) {\n                    reject(\"name moet een string met minstens 2 karakters zijn\");\n                    return;\n                }\n\n                var person = { name: name };\n                fetch(_this2.url + id, { method: \"PUT\", body: JSON.stringify(person) }).then(function (response) {\n                    if (!response.ok) {\n                        reject(\"rejected:\" + response.status);\n                        return;\n                    }\n                    resolve(response.json());\n                });\n            });\n        }\n    }]);\n\n    return PersonModel;\n}();\n\nexports.default = PersonModel;\n\n//# sourceURL=webpack:///./src/js/model/PersonModel.js?");

/***/ }),

/***/ "./src/js/view/ErrorView.js":
/*!**********************************!*\
  !*** ./src/js/view/ErrorView.js ***!
  \**********************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\n\nObject.defineProperty(exports, \"__esModule\", {\n    value: true\n});\n\nvar _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if (\"value\" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();\n\nfunction _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError(\"Cannot call a class as a function\"); } }\n\nvar ErrorView = function () {\n    function ErrorView() {\n        _classCallCheck(this, ErrorView);\n    }\n\n    _createClass(ErrorView, [{\n        key: \"show\",\n        value: function show(data) {\n            var preElement = document.createElement(\"pre\");\n            var error = data.error;\n            var output = error + \"\\n\";\n            var textNode = document.createTextNode(output);\n            preElement.appendChild(textNode);\n            document.getElementById('output').appendChild(preElement);\n        }\n    }]);\n\n    return ErrorView;\n}();\n\nexports.default = ErrorView;\n\n//# sourceURL=webpack:///./src/js/view/ErrorView.js?");

/***/ }),

/***/ "./src/js/view/PersonView.js":
/*!***********************************!*\
  !*** ./src/js/view/PersonView.js ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\n\nObject.defineProperty(exports, \"__esModule\", {\n    value: true\n});\n\nvar _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if (\"value\" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();\n\nfunction _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError(\"Cannot call a class as a function\"); } }\n\nvar PersonView = function () {\n    function PersonView() {\n        _classCallCheck(this, PersonView);\n    }\n\n    _createClass(PersonView, [{\n        key: \"show\",\n        value: function show(data) {\n            var preElement = document.createElement(\"pre\");\n            var person = data.person;\n            var output = person.id + \" \" + person.name + \"\\n\";\n            var textNode = document.createTextNode(output);\n            preElement.appendChild(textNode);\n            document.getElementById('output').appendChild(preElement);\n        }\n    }]);\n\n    return PersonView;\n}();\n\nexports.default = PersonView;\n\n//# sourceURL=webpack:///./src/js/view/PersonView.js?");

/***/ }),

/***/ "./src/js/view/PersonsView.js":
/*!************************************!*\
  !*** ./src/js/view/PersonsView.js ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\n\nObject.defineProperty(exports, \"__esModule\", {\n    value: true\n});\n\nvar _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if (\"value\" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();\n\nfunction _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError(\"Cannot call a class as a function\"); } }\n\nvar PersonsView = function () {\n    function PersonsView() {\n        _classCallCheck(this, PersonsView);\n    }\n\n    _createClass(PersonsView, [{\n        key: \"show\",\n        value: function show(data) {\n            var preElement = document.createElement(\"pre\");\n            var numberOfPersons = data.persons.length;\n            var output = \"\";\n            for (var i = 0; i < numberOfPersons; i++) {\n                var person = data.persons[i];\n                output = output + person.id + \" \" + person.name + \"\\n\";\n            }\n            var textNode = document.createTextNode(output);\n            preElement.appendChild(textNode);\n            document.getElementById('output').appendChild(preElement);\n        }\n    }]);\n\n    return PersonsView;\n}();\n\nexports.default = PersonsView;\n\n//# sourceURL=webpack:///./src/js/view/PersonsView.js?");

/***/ })

/******/ });