from flask import Flask, request, jsonify
import pandas as pd
from fastai.imports import *
from sklearn.externals import joblib

app = Flask(__name__)

@app.route("/")
def hello():
    return "Hello World!!!"

@app.route('/predict', methods=['POST'])
def predict():
     json_ = request.json
     query_df = pd.DataFrame(json_, index=[0])
     query = pd.get_dummies(query_df)
     prediction = clf.predict(query)
     return jsonify({'prediction': list(prediction)})

if __name__ == '__main__':
    host = "0.0.0.0"
    port = 9999
    debug = False

    clf = joblib.load('./app/model.pkl')
    app.run(host, port, debug)
