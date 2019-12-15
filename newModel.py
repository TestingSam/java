#!/usr/bin/env python
# coding: utf-8

# In[1]:


import os
from operator import itemgetter    
import numpy as np
import pandas as pd
import keras
import re

from tensorflow.keras.preprocessing import sequence
from tensorflow.keras.models import Sequential, load_model
from tensorflow.keras.layers import Dense, Dropout, Activation
from tensorflow.keras.layers import Embedding
from tensorflow.keras.layers import Conv1D, GlobalMaxPooling1D
from tensorflow.keras.datasets import imdb
from tensorflow.keras.layers import LSTM
 
from tensorflow.keras.datasets import reuters
print(os.getcwd())
print("Modules imported \n")


# In[2]:


# set parameters:
max_features = 50000
maxlen = 400
batch_size = 32
embedding_dims = 50
filters = 250
kernel_size = 3
hidden_dims = 250
epochs = 2


# In[3]:


def get_fixed_word_to_id_dict(): 
    INDEX_FROM=3   # word index offset
    
    word_to_id = keras.datasets.imdb.get_word_index()
    word_to_id = {k:(v+INDEX_FROM) for k,v in word_to_id.items()}
    word_to_id[" "] = 0
    word_to_id["<START>"] = 1
    word_to_id["<UNK>"] = 2
    return word_to_id


# In[4]:


def decode_to_sentence(data_point): 
    #NUM_WORDS=1000 # only use top 1000 words
    
    word_to_id = get_fixed_word_to_id_dict()

    id_to_word = {value:key for key,value in word_to_id.items()}
    return ' '.join( id_to_word[id] for id in data_point )


# In[5]:


def encode_sentence(sent): 
    # print(sent)
    encoded = []
    
    word_to_id = get_fixed_word_to_id_dict() 
    
    for w in sent.split(" "): 
        if w in word_to_id: 
            encoded.append(word_to_id[w])
        else: 
            encoded.append(2)        # We used '2' for <UNK> 
    return encoded 


# In[6]:


test_sentences = [] 

test_sentence = "i do not like this at all"
test_sentence = encode_sentence(test_sentence)
test_sentences.append(test_sentence) 


test_sentence = "loved it"
test_sentence = encode_sentence(test_sentence)
test_sentences.append(test_sentence) 


test_sentence = "did not love it"
test_sentence = encode_sentence(test_sentence)
test_sentences.append(test_sentence)


test_sentence = "cannot say that i loved it"
test_sentence = encode_sentence(test_sentence)
test_sentences.append(test_sentence)


# In[7]:


test_sentences = sequence.pad_sequences(test_sentences, maxlen=maxlen)


# In[8]:


model = load_model(r'D:\downloads\Sentiment_Model.h5')


# In[9]:


'''predictions = model.predict(test_sentences)
#sentiment = ['NEGATIVE' if i < 0.5 else 'POSITIVE' for i in predictions]
print(predictions)
sentiment=[]
for i in range(predictions.shape[0]):
    for i in range(predictions.shape[0]):
        if predictions[i][0] < 0.6:
            sentiment.append("Negative")
        elif predictions[i][0] > 0.6 and predictions[i][0] < 0.7:
            sentiment.append("Neutral")
        else:
            sentiment.append("Positive")
for i in range(test_sentences.shape[0]): 
    print(decode_to_sentence(test_sentences[i]), "--", sentiment[i])'''


# In[10]:


dataset = pd.read_csv(r'D:\downloads\Tweets v0 4.csv', encoding = "ISO-8859-1")
dataset = dataset.sample(frac=1).reset_index(drop=True)
dataset.head()


# In[14]:


test_sentences_new = [] 

dataset['text'].apply(lambda x: x.lower())
dataset['text'] = dataset['text'].apply(lambda x: re.sub('[^a-zA-Z0-9\s]',"",x))
for news in dataset['text'].values:
    test_sentence_new = encode_sentence(news)
    test_sentences_new.append(test_sentence_new)

test_sentences_new = sequence.pad_sequences(test_sentences_new, maxlen=maxlen)
predictions = model.predict(test_sentences_new)
#sentiment = ['NEGATIVE' if i < 0.5 else 'POSITIVE' for i in predictions]
print(predictions)
sentiment_new=[]
news=[]
label=[]
for i in range(predictions.shape[0]):
    for i in range(predictions.shape[0]):
        if predictions[i][0] < 0.6:
            sentiment_new.append("Negative")
        elif predictions[i][0] > 0.6 and predictions[i][0] < 0.7:
            sentiment_new.append("Neutral")
        else:
            sentiment_new.append("Positive")
for i in range(test_sentences_new.shape[0]):
    print(dataset['text'].values[i], "--", predictions[i][0],"--", sentiment_new[i])

for i in range(test_sentences_new.shape[0]):
    news.append(dataset['text'].values[i])
    label.append(sentiment_new[i])
    
dict = {'headline': news, 'label': label}
df = pd.DataFrame(dict)
df.to_csv(r'D:\shinu\stockPredictor\newsSentiments.csv', index=False) 


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




