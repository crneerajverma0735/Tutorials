import React from 'react';
import { StyleSheet, View, Text } from 'react-native';
import Card from '../shared/Card';
import { globalStyles } from '../styles/global';

export default function ReviewDetails({ navigation }) {

    return (
        <View style={globalStyles.container}>
            <Card>
                <Text style={globalStyles.titleText}>    {navigation.getParam('title')}</Text>
                <Text style={globalStyles.titleText}>
                    {navigation.getParam('body')}
                </Text>
                <Text style={globalStyles.titleText}>
                    {navigation.getParam('rating')}
                </Text>
            </Card>
        </View>
    );
}
