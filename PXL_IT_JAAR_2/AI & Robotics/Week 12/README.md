# Week 12: Unsupervised Learning

## 1. Unsupervised Learning
### Goals
The junior-colleague
* can explain Unsupervised Learning in their own words
* can describe the general flow of an unsupervised learning pipeline
* can list at least 3 examples of unsupervised learning
* can explain the purpose of clustering
* can explain the difference between clustering and classification
* can explain how to prepare data for clustering
* can explain how the k-means algorithm works in their own words
* can describe the advantages and disadvantages of k-means
* can explain how k-means++ optimizes the centroid choice problem of k-means
* can explain how the Elbow method in the context of k-means works
* can implement k-means and DBSCAN for a given clustering problem
* can explain how the DBSCAN clustering algorithm works in their own words
* can describe the advantages and disadvantages of DBSCAN
* can explain how hierarchical clustering works on the basis of a visual representation of a dataset
* can describe the different linkage forms for hierarchical clustering
* can describe the advantages and disadvantages of hierarchical clustering

**[Presentation](Week%2012%20-%20Unsupervised%20Learning.pdf)**

#### Data preparation
- https://www.edupristine.com/blog/k-means-algorithm

#### K-Means
- Visualizing clustering: https://www.naftaliharris.com/blog/visualizing-k-means-clustering/
- Elbow method in sklearn: https://www.scikit-yb.org/en/latest/api/cluster/elbow.html

#### DBSCAN
- https://medium.com/@elutins/dbscan-what-is-it-when-to-use-it-how-to-use-it-8bd506293818

#### Hierarchical clustering

#### Similarity Measures
http://dataaspirant.com/2015/04/11/five-most-popular-similarity-measures-implementation-in-python/

#### Silhouette score
- https://en.wikipedia.org/wiki/Silhouette_(clustering)


#### Dimensionality reduction
Really useful techniques for visualizing high-dimensional data in lower dimensions. Ergo, could be **useful for the PE**:
* **TSNE**: good for low amount of features
- https://scikit-learn.org/stable/modules/generated/sklearn.manifold.TSNE.html
* **PCA**: good for high amount of features and dense data
- https://scikit-learn.org/stable/auto_examples/decomposition/plot_pca_iris.html
- https://scikit-learn.org/stable/modules/generated/sklearn.decomposition.PCA.html
* **TruncatedSVD**: good for high amount of features and sparse data


### Extra
Clustering Overview: 
- https://towardsdatascience.com/unsupervised-machine-learning-clustering-analysis-d40f2b34ae7e
- https://scikit-learn.org/stable/modules/clustering.html

#### OPTICS
- https://towardsdatascience.com/clustering-using-optics-cac1d10ed7a7
- https://en.wikipedia.org/wiki/OPTICS_algorithm
- https://pdfs.semanticscholar.org/0157/f142bee7b462897424908cd6c73d84f225cc.pdf
- https://scikit-learn.org/dev/modules/generated/sklearn.cluster.OPTICS.html

Location Analytics with Scikit-Learn, Pandas, Numpy, and Matplotlib: http://angusmacnab.com/Location_SKLearn_Tut_MSData_0.2.html
(**useful for the PE**)

Evaluating Clustering Techniques: http://ds.cs.ut.ee/Members/hadachi/dss-fall-2014/Dmitri-Timasjov-final-report.pdf
