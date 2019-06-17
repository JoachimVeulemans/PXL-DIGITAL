# Week 8: Supervised Learning: Data & Optimization

### Goals
The junior-colleague
* can explain the link between data & optimization
* can describe the reasons for understanding your data
* can explain how to prepare and clean a dataset for training a Machine Learning model (categorical variables, dates, missing values)
* can explain one-hot encoding
* can explain the difference between parameters and hyperparameters
* can list and describe 3 ways to tune the hyperparameters of a Machine Learning model
* can list and describe 3 hyperparameters of a Random Forest
* can explain how to acquire the out-of-bag score for a Random Forest and why it's useful
* can explain why feature importance is important in the context of Machine Learning
* can explain the concept of Occam's Razor in the context of Machine Learning
* can describe ways to speed up the training process of a Random Forest


The original notebook for this class can be found under fastai/courses/ml1/lesson1-rf.ipynb.

The slightly modified version can be found under notebooks on this page.

### Extra
#### Installation
**fast.ai**

The installation guide for fastai 0.7 can be found at:
https://forums.fast.ai/t/fastai-v0-7-install-issues-thread/24652
Important remarks
* Make sure to create the CPU environment if your GPU is not supported by your operating
system.
* Always activate the Fast.AI environment before running notebook experiments!

        conda activate fastai
        Or
        conda activate fastai-cpu
    
It is highly recommended to create a symlink in the folder where you are storing your notebooks to the
folder where you cloned the fastai git repository:

        $ ln -s <path>/<to>/fastai/old/fastai fastai
  
This way you can import fastai in your notebooks easily like this:

        from fastai.imports import *
        from fastai.structured import *
    
    
This is done because getting the old version of the Fast.AI library like this does not add the library to
your PATH.

Starting up your jupyter notebook

        $ source anaconda.bash
        $ conda activate fastai(-cpu)
        $ jupyter-notebook

