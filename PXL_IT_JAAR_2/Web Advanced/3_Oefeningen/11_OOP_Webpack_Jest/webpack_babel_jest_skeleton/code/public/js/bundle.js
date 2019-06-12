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
eval("\n\nvar _Point = __webpack_require__(/*! ./drawing/Point */ \"./src/js/drawing/Point.js\");\n\nvar _Point2 = _interopRequireDefault(_Point);\n\nvar _ColorPoint = __webpack_require__(/*! ./drawing/ColorPoint */ \"./src/js/drawing/ColorPoint.js\");\n\nvar _ColorPoint2 = _interopRequireDefault(_ColorPoint);\n\nfunction _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }\n\nvar point = new _Point2.default(1, 2);\nvar preElement = document.createElement(\"pre\");\nvar textNode = document.createTextNode(point + \"\\n\");\n\nvar colorPoint = new _ColorPoint2.default(1, 2, 'red');\nvar textNode2 = document.createTextNode(colorPoint);\n\npreElement.appendChild(textNode);\npreElement.appendChild(textNode2);\ndocument.getElementById('output').appendChild(preElement);\n\n//# sourceURL=webpack:///./src/js/app.js?");

/***/ }),

/***/ "./src/js/drawing/ColorPoint.js":
/*!**************************************!*\
  !*** ./src/js/drawing/ColorPoint.js ***!
  \**************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\n\nObject.defineProperty(exports, \"__esModule\", {\n    value: true\n});\n\nvar _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if (\"value\" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();\n\nvar _get = function get(object, property, receiver) { if (object === null) object = Function.prototype; var desc = Object.getOwnPropertyDescriptor(object, property); if (desc === undefined) { var parent = Object.getPrototypeOf(object); if (parent === null) { return undefined; } else { return get(parent, property, receiver); } } else if (\"value\" in desc) { return desc.value; } else { var getter = desc.get; if (getter === undefined) { return undefined; } return getter.call(receiver); } };\n\nvar _Point2 = __webpack_require__(/*! ./Point */ \"./src/js/drawing/Point.js\");\n\nvar _Point3 = _interopRequireDefault(_Point2);\n\nfunction _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }\n\nfunction _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError(\"Cannot call a class as a function\"); } }\n\nfunction _possibleConstructorReturn(self, call) { if (!self) { throw new ReferenceError(\"this hasn't been initialised - super() hasn't been called\"); } return call && (typeof call === \"object\" || typeof call === \"function\") ? call : self; }\n\nfunction _inherits(subClass, superClass) { if (typeof superClass !== \"function\" && superClass !== null) { throw new TypeError(\"Super expression must either be null or a function, not \" + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }\n\nvar ColorPoint = function (_Point) {\n    _inherits(ColorPoint, _Point);\n\n    function ColorPoint(x, y, color) {\n        _classCallCheck(this, ColorPoint);\n\n        var _this = _possibleConstructorReturn(this, (ColorPoint.__proto__ || Object.getPrototypeOf(ColorPoint)).call(this, x, y));\n\n        _this.color = color;\n        return _this;\n    }\n\n    _createClass(ColorPoint, [{\n        key: \"toString\",\n        value: function toString() {\n            return _get(ColorPoint.prototype.__proto__ || Object.getPrototypeOf(ColorPoint.prototype), \"toString\", this).call(this) + \" in \" + this.color;\n        }\n    }]);\n\n    return ColorPoint;\n}(_Point3.default);\n\nexports.default = ColorPoint;\n\n//# sourceURL=webpack:///./src/js/drawing/ColorPoint.js?");

/***/ }),

/***/ "./src/js/drawing/Point.js":
/*!*********************************!*\
  !*** ./src/js/drawing/Point.js ***!
  \*********************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

"use strict";
eval("\n\nObject.defineProperty(exports, \"__esModule\", {\n\tvalue: true\n});\n\nvar _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if (\"value\" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();\n\nfunction _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError(\"Cannot call a class as a function\"); } }\n\nvar Point = function () {\n\tfunction Point(x, y) {\n\t\t_classCallCheck(this, Point);\n\n\t\tif (isNaN(x) || isNaN(y)) {\n\t\t\tthrow new Error(\"Parameter is not a number!\");\n\t\t}\n\t\tthis.x = x;\n\t\tthis.y = y;\n\t}\n\n\t_createClass(Point, [{\n\t\tkey: \"getX\",\n\t\tvalue: function getX() {\n\t\t\treturn this.x;\n\t\t}\n\t}, {\n\t\tkey: \"getY\",\n\t\tvalue: function getY() {\n\t\t\treturn this.y;\n\t\t}\n\t}, {\n\t\tkey: \"toString\",\n\t\tvalue: function toString() {\n\t\t\treturn \"(\" + this.x + \",\" + this.y + \")\";\n\t\t}\n\t}]);\n\n\treturn Point;\n}();\n\nexports.default = Point;\n\n//# sourceURL=webpack:///./src/js/drawing/Point.js?");

/***/ })

/******/ });